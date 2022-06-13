package models;

import java.lang.reflect.Executable;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Funcionario {
  private HashMap<Integer, Autocarros> busList;
  private HashMap<Integer, Thread> busListThreads;
  private ExecutorService threadPool;


  public Funcionario(){
    this.busList = new HashMap<>();
    this.busListThreads = new HashMap<>();
    this.threadPool = Executors.newCachedThreadPool();
  }

  public void adicionarNovaThread(Autocarros autocarro){
    this.busList.put(autocarro.getBusID(), autocarro);
    Thread thread = new Thread(autocarro);
    this.busListThreads.put(autocarro.getBusID(), thread);
    this.threadPool.submit(thread);
  }


}
