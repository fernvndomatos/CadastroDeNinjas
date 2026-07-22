package dev.java10x.CadastroDeNinjas.Ninjas.Controller.Service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é minha primeira mensagem nessa rota";
    }

    //Adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosOsNinjas(){
        return "Mostrar ninjas";
    }

    //Procurar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosOsNinjasPorId(){
        return "Mostrar ninja por id";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinjasPorId() {
        return "Alterar ninja por id";
    }

    //Deletat ninja (DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }

}
