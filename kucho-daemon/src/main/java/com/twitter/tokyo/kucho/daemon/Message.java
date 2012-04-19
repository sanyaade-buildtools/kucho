package com.twitter.tokyo.kucho.daemon;

import java.util.Random;

public class Message {
    static String[] messages = {
            "がんばってピ",
            "あきらめないで！",
            "ファイト一発",
            "疲れたらお砂場で遊んでぴよ",
            "じゃあ巣作りにもどるぴよ",
            "はばないすでーぴよ",
            "かもめはかもめ",
            "今夜は唐揚げがおすすめピヨ",
            "にわとりと卵、どっちが先なのかな？",
            "最近温泉入ってる？♨",
            "甘い物🍰食べても一踏ん張り！",
            "きょうはもうくたびれちゃった🐳",
            "お昼はもう食べた？🐙",
            "チキンラーメン🐔の季節だよね",
            "🐤ピヨ♪",
            "今日も仕事がんばるピヨ🐤",
            "宇宙までひとっ飛びしたいなー🚀",
            "イルカ🐬もクジラ🐳なんだよ。知ってた？",
            "トサカ🐔にはコラーゲンがいっぱいだよ！",
            "ポテト🍟がどうしても食べたい時ってあるよねー！",
            "豚骨🐷ラーメン食べたいなー",
            "ペペロンチーノ🍝はいかが？",
            "今夜も一杯🍺いっとく？",
            "ほほほのほーい",
            "これで快適ピヨ",
            "焼き鳥食べたいぴよね",
            "これで快適になるといいぴよ",
            "今日も業務をこなしているぴよ",
            "また何かあったらいってぴよ",
            "じゃあお昼寝行ってくるぴよ",
            "ばいばいさようならー",
            "Dooo youuur bestttt!!!",
            "そろそろかえりたいピヨ",
            "これからデートぴよ",
            "ぴよ。ぴよ。ぴよ。",
            "空調の操作もけっこー難しいんだよ。",
            "今週末はまだフリーぴよ。誰か誘って〜〜",
            "そういえば私はオスなの？メスなの？",
            "納豆食べたいからかってくるぴよ",
            "そういえば焼き鳥と唐揚げってどちらがおいしいぴよ？",
            "have a nice kucho!",
            "I can fly!!!",
    };

    public static String getMessage() {
        return messages[new Random(System.currentTimeMillis()).nextInt(messages.length)];
    }
}
