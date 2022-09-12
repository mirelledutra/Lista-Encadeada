public class listaEncadeada01 {
    public static class No{
        public int value;
        public No prox;

        public No(int value){
            this.value = value;
        }
    }
    
    public No inicio;

    public void Add(int newValue){
        
        No myNewNo = new No(newValue);

        if(inicio == null){

            inicio = myNewNo;

        }else{
            No aux = inicio;

            while(aux.prox != null){
                aux = aux.prox;
            }

            aux.prox = myNewNo;
        }
    }

    public void ShowMyList(){
        No atual = inicio;
        while(atual != null){
            System.out.println(atual.value);
            atual = atual.prox;
        }
    }
    public static void main(String[] args){
        listaEncadeada01 atividade01 = new listaEncadeada01();
        
        atividade01.Add(12);
        atividade01.Add(15);
        atividade01.Add(17);
        atividade01.Add(45);
        atividade01.Add(86);
        atividade01.ShowMyList();
  
    }

}
