package com.teamdrt.nijanand.ui.lyrics;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.teamdrt.nijanand.database.bhajan;
import com.teamdrt.nijanand.database.bhajanrepository;

import java.util.List;

public class LyricsViewModel extends AndroidViewModel {
    Application application;
    bhajanrepository repository;
    public LyricsViewModel(Application application) {
        super(application);
        this.application=application;
        repository=new bhajanrepository(application);
    }

    public void insert(bhajan bhajan){
        repository.insert(bhajan);
    }

    public void update(bhajan bhajan){
        repository.Update(bhajan);
    }

    public void delete(bhajan bhajan){
        repository.delete(bhajan);
    }

    public LiveData<List<bhajan>> getAllbhajans(){
        return repository.getGetALlbhajan();
    }


    public void initiatedata(){
        insert(new bhajan(1,"સતગુરૂજી અમને ચરણોમાં લેજો","સતગુરૂજી અમને ચરણોમાં લેજો\n" +
                "ભટકેલા મનની બાવા ભૂલું સુધારો\n" +
                "સમજણ ને સોટે અમને દેજો સતગુરુજી....૧\n" +
                "કાયાનાં દેવળ અમને લાગે છે કાચા\n" +
                "દોયલી વેળાયે દરશન દેજો સતગુરૂજી.....૨\n" +
                "આવન જાવનની બાવા ગલીયું છે વાંકી સમરણની સુધદાતા દેજો\n" +
                "સતગુરુજી....૩\n" +
                "મરણ તીથીનો બાવા મહીમાં છે મોટો\n" +
                "અવસર વેળાએ આડા રેજો\n" +
                "સતગુરૂજી....૪\n" +
                "કરૂણાના સ્વામી તમને દુનીયાં સૌ કે’છે\n" +
                "બ્રદને સંભારી બેલે રેજો\n" +
                "સતગુરુજી....૫\n" +
                "છોડીને જાસો તો તો શોભે નહી સ્વામી\n" +
                "નવખંડમાં લાજે તમારો નેજો\n" +
                "સતગુરૂજી....૬\n" +
                "\"સવો\" કહે સ્વામી અમમાં સર્વે છે ખામી\n" +
                "અવગુણ નવ જોશો અંતરજામી...૭",false));

        insert(new bhajan(2,"વાતું કોને જઈને કરીએ","વાતું કોને જઈને કરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "હૈયાની હુતાશણને બસ\n" +
                "હૈયામાં સંઘરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "ઈ વાતડિયે વ્રેમાન્ડ ડોલે\n" +
                "દવ લાગે મધદરિયે\n" +
                "ઈ વાતડિયે વ્રેમાન્ડ ડોલે\n" +
                "દવ લાગે મધદરિયે\n" +
                "ઊકળતા આ ચરુ અંતરના\n" +
                "અગ્નિ ઝાળો લઈએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "સંકેલાણી દિશાયું સઘળી\n" +
                "ક્યાં ઉતારો કરીએ\n" +
                "જગત તણા તપતા રણમાં\n" +
                "અમે તરસ્યાં તરસે મરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "હૈયાની હુતાશણને બસ\n" +
                "હૈયામાં સંઘરીએ\n" +
                "વાતું કોને જઈને કરીએ\n" +
                "કવિ દાદ",false));

        insert(new bhajan(3,"નવાં કલેવર ધરો","નવાં કલેવર ધરો, હંસલા! નવાં કલેવર ધરો,\n" +
                "ભગવી કંથા ગઈ ગંધાઈ, સાફ ચદરિયા ધરો\n" +
                "હંસલા! નવાં કલેવર ધરો.\n" +
                "મોતી તણો તેં ચારો માની ચણિયાં વિખનાં ફળો,\n" +
                "કણ સાટે છો ચુગો કાંકરી, કૂડના બી નવ ચરો\n" +
                "હંસલા ! નવાં કલેવર ધરો.\n" +
                "ગગન તારલે અડવા ઊડતાં પૃથ્વીથીય ટળ્યો;\n" +
                "ઘૂમો સીમાડા આભ તણા, પણ ધરણી નવ પરહરો\n" +
                "હંસલા! નવાં કલેવર ધરો.\n" +
                "અધુઘડી આંખે જોયું તે સૌ પુરણ દીઠું કાં ગણો?\n" +
                "આપણાં દીઠાં અસત ઘણેરાં, નીરખ્યાનો શો બરો!\n" +
                "હંસલા! નવાં કલેવર ધરો.\n" +
                "રાત પડી તેને પરોઢ સમજી ભ્રમિત બા'ર નીસર્યો\n" +
                "હવે હિંમતમાં રહો જી રુદિયા! અનહદમાં સંચરો\n" +
                "હંસલા! નવાં કલેવર ધ",false));
    }
}