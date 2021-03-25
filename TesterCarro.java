public class TesterCarro extends Carro {
    

    public static void main(String[] args) {
       
        TesterCarro func = new TesterCarro();
        func.setCor("Vermelho");
        func.cordoCarro();
        func.setNum_acentos(4);
        func.numerodeAcentos();
    }


     //metodos da classe
  public void cordoCarro()
  {
      System.out.println(" A cor do carro é " + this.cor);
  }

  public void numerodeAcentos()
  {
      System.out.println(" O numero de acentos é  " + this.num_acentos);
  }
  
}
}