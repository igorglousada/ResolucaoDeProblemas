package problema01_igorlousada;

import java.util.ArrayList;
import java.util.List;

public class CadPes {
    private List<Nome> listPes = new ArrayList<Nome>();
    public void setListPes(Nome n){
        listPes.add(n);
        System.out.println("\n\nPessoa "+n.getNome()+" cadastrada com sucesso!");
    }

    public Nome consPes(Nome n, int cont){
        for(int i =cont;i<listPes.size();i++){
            if(listPes.get(i)!=null){
                return listPes.get(i);
            }
        }
        return null;
    }
}

