
public class Livro {
    
        private String  titulo = "Vidas Secas";
        private String autor = "Graciliano Ramos";
        private int paginas = 174;
        private int ISBN = 123123;
        private double valor = 15.5;
    
        /* DECLARAÇÃO DOS MÉTODOS DE GET: */
        /*Método getAgencia*/
        public String getTitulo() {
            return titulo;
        }
        
            public String getAutor() {
            return autor;
        }
                public int getPaginas() {
                return paginas;
        }
                    public int getISBN() {
                    return ISBN;
        }
                        public double getValor() {
                        return valor;
        }
                        
                        
                //DECLARANDO SET
                public void setTitulo(String titulo){
                this.titulo = titulo;
                }
                /*Método setConta*/
                    public void setAutor(String autor){
                    this.autor = autor;
                }
                
                        public void setPaginas(int paginas){
                        this.paginas = paginas;
                }
                
                            public void setISBN(int ISBN){
                            this.ISBN = ISBN;                         
                }
                                /*Método setSaldo*/
                                public void setValor(double valor){
                                this.valor = valor;
    }
        
        public void cadastrar(String titulo, String autor, int paginas, int ISBN, double valor){
            
         setTitulo(titulo);
         setAutor(autor);
         setPaginas(paginas);
         setISBN(ISBN);
         setValor(valor);
            
        }
               
    /**MÉTODOS DE EXIBIR DADOS DO LIVRO**/
        public void exibirDados(){
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Autor: " + getAutor());
            System.out.println("Paginas: " + getPaginas());
            System.out.println("ISBN: " + getISBN());
            System.out.println("Valor: " + getValor());
        }
}
