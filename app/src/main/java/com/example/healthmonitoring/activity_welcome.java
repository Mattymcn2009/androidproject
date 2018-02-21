package com.example.healthmonitoring;

import android.app.AlertDialog;
        import android.database.Cursor;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;


public class activity_welcome extends AppCompatActivity{
    DatabaseHelper myDb;
    EditText editName,editAge,editGender ,editCity, editCurrentLevel, editTextId;
    Button btnAddData;
    Button btnviewAll;
    Button btnDelete;

    Button btnviewUpdate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        myDb = new DatabaseHelper(this);

        editName = (EditText)findViewById(R.id.editText_name);
        editAge = (EditText)findViewById(R.id.editText_Age);
        editGender = (EditText)findViewById(R.id.editText_gender);
        editCity = (EditText)findViewById(R.id.editText_city);
        editCurrentLevel = (EditText)findViewById(R.id.editText_currentlevel);
        editTextId = (EditText)findViewById(R.id.editText_id);
        btnAddData = (Button)findViewById(R.id.button_add);
        btnviewAll = (Button)findViewById(R.id.button_viewAll);
        btnviewUpdate= (Button)findViewById(R.id.button_update);
        btnDelete= (Button)findViewById(R.id.button_delete);
        AddData();
        viewAll();
        UpdateData();
        DeleteData();
    }
    public void DeleteData() {
        btnDelete.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Integer deletedRows = myDb.deleteData(editTextId.getText().toString());
                        if(deletedRows > 0)
                            Toast.makeText(activity_welcome.this,"Data Deleted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(activity_welcome.this,"Data not Deleted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public void UpdateData() {
        btnviewUpdate.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isUpdate = myDb.updateData(editTextId.getText().toString(),
                                editName.getText().toString(),
                                editAge.getText().toString(),
                                editGender.getText().toString(),
                                editCity.getText().toString(),
                                editCurrentLevel.getText().toString());
                        if(isUpdate == true)
                            Toast.makeText(activity_welcome.this,"Data Update",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(activity_welcome.this,"Data not Updated",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
    public  void AddData() {
        btnAddData.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        boolean isInserted = myDb.insertData(editName.getText().toString(),
                                editAge.getText().toString(),
                                editGender.getText().toString(),
                                editCity.getText().toString(),
                                editCurrentLevel.getText().toString());
                        if(isInserted == true)
                            Toast.makeText(activity_welcome.this,"Data Inserted",Toast.LENGTH_LONG).show();
                        else
                            Toast.makeText(activity_welcome.this,"Data not Inserted",Toast.LENGTH_LONG).show();
                    }
                }
        );
    }

    public void viewAll() {
        btnviewAll.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Cursor res = myDb.getAllData();
                        if(res.getCount() == 0) {
                            // show message
                            showMessage("Error","Nothing found");
                            return;
                        }

                        StringBuffer buffer = new StringBuffer();
                        while (res.moveToNext()) {
                            buffer.append("Id :"+ res.getString(0)+"\n");
                            buffer.append("Name :"+ res.getString(1)+"\n");
                            buffer.append("Age :"+ res.getString(2)+"\n");
                            buffer.append("Gender :"+ res.getString(3)+"\n\n");
                            buffer.append("City :"+ res.getString(3)+"\n\n");
                            buffer.append("CurrentLevel :"+ res.getString(3)+"\n\n");
                        }

                        // Show all data
                        showMessage("Data",buffer.toString());
                    }
                }
        );
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }



}
