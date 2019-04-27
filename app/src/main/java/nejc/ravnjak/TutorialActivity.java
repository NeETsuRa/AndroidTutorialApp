package nejc.ravnjak;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TutorialActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
       setContentView(R.layout.main);
       Thread timer = new Thread(){
    	   public void run(){
    		   try{
    			   sleep(2000);
    			   startActivity(new Intent("nejc.ravnjak.DRUGA"));
    		   } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		   finally{
    			   //finish();
    		   }
    	   }
       };
       
       timer.start();
    }
    	   
    	   
       
       
       /*try{ 
       for (int i=0; i<555; i++);
       
       startActivity(new Intent("nejc.ravnjak.DRUGA"));
       }
       
       finally{
    	   
    	   
       }
       }*/
    public void gumb1 (View v){
    	startActivity(new Intent("nejc.ravnjak.DRUGA"));
    	finish();
    	
    }
        
    
}