package com.example.h1

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import com.example.h1.databinding.ActivityUploadImageBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.storage.FirebaseStorage
import com.google.firebase.storage.StorageReference

class UploadImage : AppCompatActivity() {

    private lateinit var binding: ActivityUploadImageBinding
    private lateinit var storageRef: StorageReference
    private lateinit var firebaseFirestore: FirebaseFirestore
    private var imageUri : Uri? = null

   // private val currentUser = FirebaseAuth.getInstance().currentUser
    //private val uid = currentUser?.uid
    //val userRef = uid?.let { firestore.collection("users").document(it) }
    //val uri = Uri.parse("file:///path/to/picture.jpg")


    //private fun uploadData(pictureUri: Uri) {
        // Create a reference to the Firebase Storage


      /*  // Create a reference to the Firestore document for the current user
        val currentUser = FirebaseAuth.getInstance().currentUser
        val uid = currentUser?.uid
        val userRef = uid?.let { firestore.collection("users").document(it) }

        // Upload the picture to Firebase Storage
        val pictureRef = storageRef.child("pictures/${pictureUri.lastPathSegment}")
        pictureRef.putFile(pictureUri)
            .addOnSuccessListener { taskSnapshot ->
                // Picture upload successful
                // Get the download URL for the picture and store it in Firestore
                pictureRef.downloadUrl.addOnSuccessListener { downloadUri ->
                    // Create a map of data to store in Firestore
                    val data = hashMapOf(
                        "name" to "John Doe",
                        "pictureUrl" to downloadUri.toString()
                    )

                    // Store the data in Firestore
                    userRef?.set(data)
                        ?.addOnSuccessListener {
                            // Data upload successful
                            Toast.makeText(this, "Data upload successful", Toast.LENGTH_SHORT).show()
                        }
                        ?.addOnFailureListener {
                            // Data upload failed
                            Toast.makeText(this, "Data upload failed", Toast.LENGTH_SHORT).show()
                        }
                }
            }
            .addOnFailureListener {
                // Picture upload failed
                Toast.makeText(this, "Picture upload failed", Toast.LENGTH_SHORT).show()
            }
    }
    uploadData(uri)
*/

    override fun onCreate(savedInstanceState: Bundle?) {


        binding = ActivityUploadImageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initVarse()
        registerClickEvents()
    }

    private fun registerClickEvents() {
        binding.registrationpic.setOnClickListener {

        }
        binding.registrationpic.setOnClickListener {

        }
        binding.registrationpic.setOnClickListener {

        }
    }

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.GetContent()){
        imageUri=it


    }
    private fun initVarse(){
        storageRef = FirebaseStorage.getInstance().reference.child("Images")
        firebaseFirestore = FirebaseFirestore.getInstance()
    }

}