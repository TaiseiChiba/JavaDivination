package com.example.demo;

public class FortuneService {
    
    /**
     * 占い判定します。
     * @param fn 値
     * @return 占い文言
     */
    public String getFortune(double fn) {
        FortuneModel fortuneModel = new FortuneModel();
        if (fn >= 0.7) {
            return fortuneModel.getGreateFortune();
        } else if (fn >= 0.4) {
            return fortuneModel.getMiddleFortune();
        } else if (fn >= 0.1) {
            return fortuneModel.getSmallFortune();
        } else {
            return fortuneModel.getMisFortune();
        }
    }
}
