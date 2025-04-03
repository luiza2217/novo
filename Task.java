public class Task{  // minha classe é um modelo do que eu quero, uma "Task" é um modelo resumido do que eu quero criar
  private int id; // este é o  id da Task
  private String description; // essa é uma descrição da Task da tarefa
 private boolean completed; // esta é o estado da task, representar representar se ele está concluído ou não
 
 public Task(int id, String description){ // vai receber o id e o método
    this.id = id; // Uso o This para dizer: "Acesse o atributo da minha classe", esse id é uma variável criada dentro do "bloco"  
    this.description = description;
    this.completed = false; //marcar como concluido "o estado" ou não  // get id vai me retorna o valor do atributo, o valor do id, porque ele é encapsulado, ele é private, só quem está dentro daquela classe vai ver


 }
  
 public int getId(){
   return this.id;

 }

   public String getDescription(){
     return this.description;

   }

   public boolean isCompleted(){
    return this.completed;

   }

   public void makCompleted(){
    this.completed = true;
   }

   @override
   public String toString(){
    return "Tarefa : id= " + id + "\n" +
           "Descrição: " + description + "\n" +
           "Completa : " + completed;       
   } 




 } 
