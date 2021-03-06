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

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called from activity_main.xml when user touches "Numbers"
     field to redirect user to NumbersActivity class via Intent object.
     * @param view
     */
    public void openNumbersList (View view){
        Intent intent = new Intent (MainActivity.this, NumbersActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called from activity_main.xml when user touches "Family Members"
     field to redirect user to FamilyMembersActivity class via Intent object.
     * @param view
     */
    public void openFamilyList (View view){
        Intent intent = new Intent (MainActivity.this, FamilyMembersActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called from activity_main.xml when user touches "Colors"
     field to redirect user to ColorsActivity class via Intent object.
     * @param view
     */
    public void openColorsList (View view){
        Intent intent = new Intent (MainActivity.this, ColorsActivity.class);
        startActivity(intent);
    }

    /**
     * This method is called from activity_main.xml when user touches "Phrases"
     field to redirect user to PhrasesActivity class via Intent object.
     * @param view
     */
    public void openPhrasesList (View view){
        Intent intent = new Intent (MainActivity.this, PhrasesActivity.class);
        startActivity(intent);
    }


}
