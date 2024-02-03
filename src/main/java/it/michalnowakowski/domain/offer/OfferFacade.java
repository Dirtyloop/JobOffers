package it.michalnowakowski.domain.offer;

import java.util.List;

public class OfferFacade {

    List<Offer> offers = List.of(new Offer(1, "Oferta 1"), new Offer(2, "Oferta 2"), new Offer(3, "Oferta 3"));

public List<Offer> findAllOffers() {
    return offers;
}
}
