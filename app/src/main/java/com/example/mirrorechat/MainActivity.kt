package com.example.mirrorechat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract.Constants
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.contus.flycommons.Constants.USER_IDENTIFIER
import com.contus.flycommons.FlyUtils
import com.contus.xmpp.FlyXMPP.sendMessage
import com.contusflysdk.activities.FlyBaseActivity
import com.contusflysdk.api.*
import com.contusflysdk.api.models.ChatMessage
import com.example.mirrorechat.databinding.ActivityMainBinding
import com.mirrorflyuikitsdk.activities.FlyRecentChatActivity
import org.json.JSONObject

class MainActivity : FlyRecentChatActivity() {
    //lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//       binding=DataBindingUtil. setContentView(this,R.layout.activity_main)
//
//        binding.send.setOnClickListener {
//            sendMessages()
//        }
//
//        FlyCore.registerUser("1278") { isSuccess, throwable, data ->
//            if(isSuccess) {
//                val responseObject = data["data"] as JSONObject
//                // Get Username and password from the object
//                Log.d("nk/response","register succes")
//                Log.d("nk/response",responseObject.getString("username")+responseObject.getString("password"))
//                connectUser(responseObject.getString("username"))
//            } else {
//                val intent=Intent(this@MainActivity,ChatActivity::class.java)
//                startActivity(intent)
//                Log.d("nk/response",data.toString())
//                // Register user failed print throwable
//                // to find the exception details.
//            }
//            fun connectUser(userId:String){
//
//
//            }
//        }

    }

//    private fun sendMessages() {
//        FlyMessenger.sendTextMessage("1278@xmpp-preprod-sandbox.mirrorfly.com", "hii", listener = object :
//            SendMessageListener {
//            override fun onResponse(isSuccess: Boolean, chatMessage: ChatMessage?) {
//                // you will get the message sent success response
//                Log.d("nk/response",isSuccess.toString())
//            }
//        })
//
//    }
//
//    private fun connectUser(string: String) {
//        ChatManager.connect(object : ChatConnectionListener {
//            override fun onConnected() {
//                val userJid=FlyUtils.getJid(string)
//                Log.d("nk/response",userJid)
//                binding.send.text=userJid
//                val intent=Intent(this@MainActivity,ChatActivity::class.java)
//                startActivity(intent)
//                // Write your success logic here to navigate Profile Page or
//                // To Start your one-one chat with your friends
//            }
//
//            override fun onDisconnected() {
//                // Connection disconnected
//                // No need implementations
//            }
//
//            override fun onConnectionNotAuthorized() {
//                // Connection Not authorized
//                // No need implementations
//            }
//        })
//    }
//
//    override fun onMessageReceived(message: ChatMessage) {
//        super.onMessageReceived(message)
//        Log.d("nk/response","received")
//        Toast.makeText(this, message.getMessageTextContent(), Toast.LENGTH_SHORT).show()
//    }
}