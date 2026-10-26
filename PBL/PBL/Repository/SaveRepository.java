package Repository;

import Exececoes.ArquivoNaoEncontrado;
import Exececoes.SlotOcupadoException;
import Model.Final;
import Model.Save;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SaveRepository {
    private static final String PASTA_SAVES = "saves";
    private static final String ARQUIVO_AUTOMATICO = "autosave.json";
    private static final String ARQUIVO_FINAIS = "finais.json";

    private final ObjectMapper mapper;

    public SaveRepository() {
        this.mapper = new ObjectMapper();
        this.mapper.enable(SerializationFeature.INDENT_OUTPUT);
        this.mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    }

    private File arquivoDoSlot(int slot) {
        return new File(PASTA_SAVES, "slot" + slot + ".json");
    }

    public void gravarFinais(List<Final> finais) throws IOException {
        File arquivo = new File(PASTA_SAVES, ARQUIVO_FINAIS);

        File pasta = arquivo.getParentFile();
        if (!pasta.exists() && !pasta.mkdirs()) {
            throw new IOException("Não foi possível criar a pasta de saves.");
        }
        mapper.writeValue(arquivo, finais);
    }

    public List<Final> lerFinais() throws IOException {
        File arquivo = new File(PASTA_SAVES, ARQUIVO_FINAIS);
        if (!arquivo.exists()) {
            return new ArrayList<>();
        }
        return mapper.readValue(arquivo, new TypeReference<List<Final>>() {});
    }

    private File arquivoAutomatico() {
        return new File(PASTA_SAVES, ARQUIVO_AUTOMATICO);
    }

    public boolean existeAutomatico() {
        return arquivoAutomatico().exists();
    }

    public void gravarAutomatico(Save save) throws IOException {
        File arquivo = arquivoAutomatico();

        File pasta = arquivo.getParentFile();
        if (!pasta.exists() && !pasta.mkdirs()) {
            throw new IOException("Não foi possível criar a pasta de saves.");
        }

        File temporario = new File(pasta, ARQUIVO_AUTOMATICO + ".tmp");
        mapper.writeValue(temporario, save);
        Files.move(temporario.toPath(), arquivo.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public Save lerAutomatico() throws ArquivoNaoEncontrado, IOException {
        File arquivo = arquivoAutomatico();

        if (!arquivo.exists()) {
            throw new ArquivoNaoEncontrado("Ainda não existe um save automático. Ele é criado assim que você começa a jogar.");
        }

        return mapper.readValue(arquivo, Save.class);
    }

    public boolean existe(int slot) {
        return arquivoDoSlot(slot).exists();
    }

    public void gravar(int slot, Save save, boolean sobrescrever) throws SlotOcupadoException, IOException {
        File arquivo = arquivoDoSlot(slot);

        if (arquivo.exists() && !sobrescrever) {
            throw new SlotOcupadoException("O slot " + slot + " já possui um save existente!");
        }

        File pasta = arquivo.getParentFile();
        if (!pasta.exists() && !pasta.mkdirs()) {
            throw new IOException("Não foi possível criar a pasta de saves.");
        }

        mapper.writeValue(arquivo, save);
    }

    public Save ler(int slot) throws ArquivoNaoEncontrado, IOException {
        File arquivo = arquivoDoSlot(slot);

        if (!arquivo.exists()) {
            throw new ArquivoNaoEncontrado("O Slot " + slot + " está vazio! Nenhum save encontrado.");
        }

        return mapper.readValue(arquivo, Save.class);
    }

    public boolean excluir(int slot) {
        File arquivo = arquivoDoSlot(slot);
        return arquivo.exists() && arquivo.delete();
    }
}
