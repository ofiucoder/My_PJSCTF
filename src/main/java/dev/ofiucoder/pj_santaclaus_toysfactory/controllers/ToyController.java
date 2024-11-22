package dev.ofiucoder.pj_santaclaus_toysfactory.controllers;


import dev.ofiucoder.pj_santaclaus_toysfactory.dtos.BadToyDto;
import dev.ofiucoder.pj_santaclaus_toysfactory.dtos.GoodToyDto;
import dev.ofiucoder.pj_santaclaus_toysfactory.models.BadToy;
import dev.ofiucoder.pj_santaclaus_toysfactory.models.GoodToy;
import dev.ofiucoder.pj_santaclaus_toysfactory.repository.ToyRepository;
import dev.ofiucoder.pj_santaclaus_toysfactory.singletons.ToyRepositorySingleton;
import dev.ofiucoder.pj_santaclaus_toysfactory.view.ElfView;

public class ToyController {

    private final ToyRepository repository;

    public ToyController() {
        this.repository = ToyRepositorySingleton.getInstance();
    }

    public void postGoodToy(GoodToyDto goodToyDto) {
        // hará algo con el repositorio
        // si todo ha ido bien devolverá la respuesta
        GoodToy toy = new GoodToy(goodToyDto.getTitle(), true, goodToyDto.getBrand(), goodToyDto.getRecommendedAge(), goodToyDto.getCategory());
        repository.setDB("good_toy");
        repository.saveGoodToy(toy);
        ElfView.addToyResponse();
    }

    public void postBadToy(BadToyDto badToyDto) {
        BadToy toy = new BadToy(badToyDto.getTitle(), false, badToyDto.getContent());
        repository.setDB("bad_toy");
        repository.saveBadToy(toy);
        ElfView.addToyResponse();
    }

}