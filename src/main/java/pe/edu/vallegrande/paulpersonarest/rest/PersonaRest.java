package pe.edu.vallegrande.paulpersonarest.rest;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.paulpersonarest.model.Persona;
import pe.edu.vallegrande.paulpersonarest.service.PersonaService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("api/personas")
@RequiredArgsConstructor
public class PersonaRest {

    private final PersonaService service;

    @GetMapping
    public Flux<Persona> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Persona> getById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Persona> create(@RequestBody Persona persona) {
        return service.save(persona);
    }

    @PutMapping("/{id}")
    public Mono<Persona> update(@PathVariable Long id, @RequestBody Persona persona) {
        return service.update(id, persona);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public Mono<Void> delete(@PathVariable Long id) {
        return service.deleteById(id);
    }
}