package com.whatsapp;

import X.C36391kE;
import X.C88794Ub;
import java.util.Arrays;

public class EmojiPicker$EmojiWeight implements C88794Ub {
    public float A00;
    public int[] A01;

    public long B8H() {
        return -1;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) obj;
            if (Float.compare(emojiPicker$EmojiWeight.A00, this.A00) != 0 || !Arrays.equals(this.A01, emojiPicker$EmojiWeight.A01)) {
                return false;
            }
        }
        return true;
    }

    public /* bridge */ /* synthetic */ boolean B3A(Object obj) {
        return Arrays.equals(this.A01, (int[]) obj);
    }

    public int hashCode() {
        return (C36391kE.A0A(Float.valueOf(this.A00)) * 31) + Arrays.hashCode(this.A01);
    }

    public EmojiPicker$EmojiWeight(int[] iArr, float f) {
        this.A01 = iArr;
        this.A00 = f;
    }

    public /* bridge */ /* synthetic */ Object BCC() {
        return this.A01;
    }

    public float BJE() {
        return this.A00;
    }

    public void Bsm(float f) {
        this.A00 = f;
    }
}
