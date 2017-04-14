/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an array of English words
        //String[] numberEnglish = {"One", "Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};

        // Create an arrayList to store the all English words
        ArrayList<String> numberEnglish = new ArrayList<String>();
        numberEnglish.add("One");
        numberEnglish.add("Two");
        numberEnglish.add("Three");
        numberEnglish.add("Four");
        numberEnglish.add("Five");
        numberEnglish.add("Six");
        numberEnglish.add("Seven");
        numberEnglish.add("Eight");
        numberEnglish.add("Nine");
        numberEnglish.add("Ten");


        //Find the root view so we can add child view to it
        LinearLayout rootView = (LinearLayout) findViewById(R.id.rootView);

        // a for loop to display the all elements in the numberEnglish arrayList
        for(int i = 0; i< numberEnglish.size() ; i++){

            //Create a TextView to display the English word
            TextView EnWordView = new TextView(this);
            //set the text to be numberEnglish at the current indext
            EnWordView.setText(numberEnglish.get(i));

            //add the TextView as another child in the root view of the layout
            rootView.addView(EnWordView);

            //Log.v("NunmbersActivity" , "My numbersEnglish"+ "["+ i +"] : " + numberEnglish.get(i));
        }






    }


}
