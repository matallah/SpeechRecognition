/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo.sphinx.helloworld;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

/**
 *
 * @author Mohamed Atallah
 */
public class Speak {

    private static final String VOICENAME = "kevin16";

   static void mySpeak() {
        Voice voice = null;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try {
            voice.speak("Hi Mr Gaur Welcome to VITS. Thanks To choose Us");
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        mySpeak();
    }
}
