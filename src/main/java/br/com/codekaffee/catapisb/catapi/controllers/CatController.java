package br.com.codekaffee.catapisb.catapi.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.codekaffee.catapisb.catapi.models.Cat;
import br.com.codekaffee.catapisb.catapi.services.CatService;

@RestController
public class CatController {
    @Autowired
    CatService catService;

    @RequestMapping(method = RequestMethod.GET, value= "/cats")
    public List<Cat> getAll(){
        return catService.getAllCats();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/cats/{id}")
    public  Cat getById(@Valid @PathVariable Long id){
        return catService.getCatById(id);
    }


    @RequestMapping(method = RequestMethod.POST, value="/cats/newCat")
    public void create(@Valid @RequestBody Cat cat){
        catService.saveCat(cat);
    }


    @RequestMapping(method= RequestMethod.DELETE, value="/cats/{id}")
    public void delete(@Valid @PathVariable Long id){
        catService.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/cats/{id}")
    public void update(@Valid @PathVariable Long id){
        catService.delete(id);
    }

}