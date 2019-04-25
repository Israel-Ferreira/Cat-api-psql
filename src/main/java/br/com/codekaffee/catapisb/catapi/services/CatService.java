package br.com.codekaffee.catapisb.catapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.codekaffee.catapisb.catapi.models.Cat;
import br.com.codekaffee.catapisb.catapi.repositories.CatRepository;

@Service
public class CatService {
    @Autowired
    CatRepository catRepository;

    public List<Cat> getAllCats(){
        return catRepository.findAll();
    }

    public Cat getCatById(Long id){
        return catRepository.findCatById(id);
    }

    public void saveCat(Cat cat){
        catRepository.save(cat);
    }

    public void update(Long id,Cat cat){
        try{
            Cat oldCat = catRepository.findCatById(id);
            oldCat.setBreedName(cat.getBreedName());
            oldCat.setCountry(cat.getCountry());
            catRepository.save(oldCat);
        }catch(Exception e){
            throw e;
        }
    }


    public void delete(Long id){
        Cat cat = catRepository.findCatById(id);
        catRepository.delete(cat);
    }
}
