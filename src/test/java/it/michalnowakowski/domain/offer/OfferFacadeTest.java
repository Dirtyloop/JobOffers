package it.michalnowakowski.domain.offer;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OfferFacadeTest {

    @Test
    public void should_succed_when_received_list_of_3_offers() {
        OfferFacade offerFacade = new OfferFacade();

        List<Offer> receivedOffers = offerFacade.findAllOffers();

        assertThat(receivedOffers.size()).isEqualTo(3);
    }

}