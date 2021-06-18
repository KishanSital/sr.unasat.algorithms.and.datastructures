package linear.binary.search.serviceImpl;

import linear.binary.search.services.QuestionService;

public class QuestionServiceImpl implements QuestionService {

    @Override
    public String algorithmAnswer(){
        return "In termen van computerprogrammering is een algoritme een reeks goed gedefinieerde instructies\n" +
                "om een bepaald probleem op te lossen.\n" +
                "Het vereist een set input en produceert een gewenste output\n";
    }
    @Override
    public String dataStructureAnswer(){
        return "Datastructures kan worden gedefinieerd als de groep gegevenselementen die een efficiënte manier\n" +
                "biedt om gegevens op de computer op te slaan\n" +
                "en te organiseren, zodat deze efficiënt kunnen worden gebruikt\n";
    }
    @Override
    public String bigONotationAnswer(){
        return "Big-O-notatie is de taal die we gebruiken om te praten over hoelang het duurt voordat een algoritme wordt uitgevoerd\n" +
                "(tijdcomplexiteit) of hoeveel geheugen wordt gebruikt door een algoritme (ruimtecomplexiteit).\n" +
                "Big-O-notatie kan de beste, slechtste en gemiddelde looptijd van een algoritme uitdrukken\n";
    }

}
