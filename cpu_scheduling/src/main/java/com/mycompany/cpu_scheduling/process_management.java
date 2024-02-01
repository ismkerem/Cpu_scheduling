package com.mycompany.cpu_scheduling;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.table.DefaultTableModel;

public class process_management{
  public static ArrayList<process_management> process_temp_list = new ArrayList<>();
   
  public String getProcess_name() {
        return Process_name;
    }

    public void setProcess_name(String Process_name) {
        this.Process_name = Process_name;
    }

    public int getArival_time() {
        return Arival_time;
    }

    public void setArival_time(int Arival_time) {
        this.Arival_time = Arival_time;
    }

    public int getBurst_time() {
        return burst_time;
    }

    public void setBurst_time(int burst_time) {
        this.burst_time = burst_time;
    }

 

    
     private String Process_name;
     private int Arival_time;
     private int burst_time;
   
     
   process_management(String Process_name,int Arival_time,int burst_time ){  
   this.Process_name=Process_name;
   this.Arival_time=Arival_time;
   this.burst_time=burst_time;
 }
   process_management(){}
   
  public void addRowToTable(process_management process,DefaultTableModel model) {
      process_temp_list.add(process);
        Object[] rowData = {process.getProcess_name(), process.getArival_time(), process.getBurst_time()};
        model.addRow(rowData);
    }

   public ArrayList<process_management> process_array_return(){
    
       return process_temp_list;
   }
 public void remove_list(int index){
     process_temp_list.remove(index);
 }
 
 public String fcfs_sort(){
     String show_result="";
   //  double[] wait_total_time=new double[process_temp_list.size()];
     double wait_total_time1=0;
      double wait_arival_time=0;
     double wait_burst_time1=0;
    Collections.sort(process_temp_list,Comparator.comparingInt(o->o.Arival_time));
    
     //sorting arival_time
  for(int i=0 ; i<process_temp_list.size();i++ ){
     wait_burst_time1+=(process_temp_list.get(i).burst_time);
         if (i < process_temp_list.size() - 1) {
             wait_arival_time= process_temp_list.get(i+1).Arival_time; 
         wait_total_time1+=wait_burst_time1-wait_arival_time;
         }
          
      
     show_result+=process_temp_list.get(i).Process_name+"-->";
      
  
  }
  wait_total_time1+=process_temp_list.get(0).Arival_time; 
  wait_total_time1/=process_temp_list.size();
show_result+="\n"+" Average waiting time:"+" "+wait_total_time1;
  
return show_result;
     
     
 }

 public String sjf_sort(){
     double total_waiting_time=0;
     double wait_burst_time=0;
     double wait_arival_time=0;
     int flag=0;
     String result="";
    
        Comparator<process_management> arrivalComparator = Comparator.comparingInt(process_management -> process_management.Arival_time);
         Comparator<process_management> burstComparator = Comparator.comparingInt(process_management -> process_management.burst_time);
         process_temp_list.sort(arrivalComparator.thenComparing(burstComparator));
         for(int i=0 ; i<process_temp_list.size();i++){
         wait_burst_time+=(process_temp_list.get(i).burst_time);
         
          if (i < process_temp_list.size() - 1) {
            wait_arival_time= process_temp_list.get(i+1).Arival_time;  
           total_waiting_time+=wait_burst_time-wait_arival_time;
         
         }
         result+=process_temp_list.get(i).Process_name+"-->";
                   
         }
          total_waiting_time+=process_temp_list.get(0).Arival_time; 
          total_waiting_time/=process_temp_list.size();
          
    result+="\n"+ "Average waiting time:"+" "+total_waiting_time;


     return result;
 }
 
}