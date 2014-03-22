package com.greenman_journey.listviewdemothree;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView) findViewById(R.id.listView);
        /*Initialize the Custom Adapter.*/
        CustomAdapter adapter = new CustomAdapter(MainActivity.this, prepareDataForListView());
        /*Set the adapter on list.*/
        listView.setAdapter(adapter);
        
    }

    /**
     * This function provides the list for records to display in list view
     * @return ArrayList<ScientistRecord>
     */
    private ArrayList<ScientistRecord> prepareDataForListView() {
	
    	ArrayList<ScientistRecord> dataRecordList = new ArrayList<ScientistRecord>();
    	
    	ScientistRecord record = new ScientistRecord();
    	record.setScientistName("John Howard Northrop");
    	record.setAwardName("Nobel Prize");
    	record.setYearOfAward("1946");
    	dataRecordList.add(record);
    	
    	record = new ScientistRecord();
    	record.setScientistName("William Giauque");
    	record.setAwardName("Nobel Prize");
    	record.setYearOfAward("1949");
    	dataRecordList.add(record);
    	
    	record = new ScientistRecord();
    	record.setScientistName("Paul Sabatier");
    	record.setAwardName("Noble Laureates");
    	record.setYearOfAward("1912");
    	dataRecordList.add(record);
    	
    	record = new ScientistRecord();
    	record.setScientistName("George Andrew Olah's");
    	record.setAwardName("Priestley Medal");
    	record.setYearOfAward("2005");
    	dataRecordList.add(record);
    	
    	record = new ScientistRecord();
    	record.setScientistName("Sir William Ramsay");
    	record.setAwardName("Noble Prize");
    	record.setYearOfAward("1904");
    	dataRecordList.add(record);
    	
    	record = new ScientistRecord();
    	record.setScientistName("V. Ramakrishnan");
    	record.setAwardName("Nobel Prize");
    	record.setYearOfAward("2009");
    	dataRecordList.add(record);
    	
    	return dataRecordList;
	}
    
    
}
