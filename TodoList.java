public class TodoList {
    public final int MAX_TASKS = 100; // final é constante, eu não posso mais criar ou alterar o dado
    private Task[] tasks;
    private int count;
    private int nextId;
    // criando método construtor que não recebe parametro, diferente do Task.java pois não recebe o parametro
 
    public TodoList(){
        this.tasks = new Task[MAX_TASKS]; //definiu o array
        this.count = 0;
        this.nextId = 1;


        // instanciar um OBJETO, ele vai manter na memória todos os dados que coloquei "números de vetores (tasks)", onde ele vai armazenar, tem o contador(count)
    }

      
       public void addTask(String description){
        if(this.count >= MAX_TASKS){
            System.out.printn("Limite de tarefas atingido");
            return; // se ele é do tipo void ele não retorna nada, ele está retornando só para finalizar
       
        }  
      Task newtask = new Task(this.nextId, description);
    this.tasks[this.count] = newTask;
    this.count = this.count + 1;
    this.nextId ++;
    System.out.println("Tarefa incluida com sucesso");

}

 public void removeTask(int id){
    boolean found = false;
    for(int i=0; i < this.count; i++){
        if(this.tasks[i].getId() == id){
         found = true;
         for(int j = i; j < this.count - 1; j++){
            tasks[j] = tasks[j+1];
         }
         tasks[this.count -1] = null;
         this.count -=1;
         System.out.println("Tarefa removida");
         break; // serve para parar o processo 

        }
    } // o que nasce no bloco morre no bloco
 }

public void makTaskCompleted(int id){
    for( Task Jtask: this.tasks){
      if(jtask == null){
          break;
      }
      if(jtask.getId() == id){
        jtask.makCompleted();
        System.out.println("Tarefa concluida");
        break;

      
    }
} 

}
    
    public void listTasks(){
        for(Task jtask: this.tasks){
            if(jtask == null){
                break;
            }
          System.out.println(jtask.toString());
       
        }
    }

}