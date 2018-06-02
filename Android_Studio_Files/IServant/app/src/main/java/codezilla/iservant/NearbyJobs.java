package codezilla.iservant;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class NearbyJobs extends AppCompatActivity {
    HashMap<Integer,Offer> hm=new HashMap<Integer,Offer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearby_jobs);

// Write a message to the database
        DatabaseReference database = FirebaseDatabase.getInstance().getReference();
        Toast.makeText(NearbyJobs.this,"hhhhhhhh",Toast.LENGTH_LONG).show();
        database.child("offers").addListenerForSingleValueEvent(new ValueEventListener() {

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List <Offer> offers = new ArrayList<Offer>();
               // for (DataSnapshot noteDataSnapshot : dataSnapshot.getChildren()) {
                 //   Offer offer = noteDataSnapshot.getValue(Offer.class);
                  //  offers.add(offer);
//                    Toast.makeText(NearbyJobs.this,"hhhhhhhh",Toast.LENGTH_LONG).show();
                //}

                //adapter.updateList(notes);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(NearbyJobs.this," Error",Toast.LENGTH_LONG).show();
            }
        });

    }
}
