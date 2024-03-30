package X;

import android.util.JsonReader;
import android.util.JsonWriter;
import com.whatsapp.EmojiPicker$EmojiWeight;
import com.whatsapp.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.1XL  reason: invalid class name */
public class AnonymousClass1XL implements AnonymousClass1XK {
    public final C19630wG A00;
    public final C19700wN A01;
    public final C20810yC A02;

    public /* bridge */ /* synthetic */ C88794Ub B4V(Object obj, float f) {
        return new EmojiPicker$EmojiWeight((int[]) obj, 1.0f);
    }

    public ArrayList BKI() {
        JsonReader jsonReader;
        File file = new File(this.A00.A00.getFilesDir(), "emoji");
        ArrayList arrayList = null;
        if (file.exists()) {
            try {
                ArrayList arrayList2 = new ArrayList();
                jsonReader = new JsonReader(new FileReader(file));
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    if ("weights".equals(jsonReader.nextName())) {
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            arrayList2.add(new EmojiPicker$EmojiWeight(C63873Lt.A00(jsonReader.nextName()).A00, (float) jsonReader.nextDouble()));
                        }
                        jsonReader.endObject();
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.close();
                arrayList = arrayList2;
                if (!C20800yB.A01(C21000yV.A02, this.A02, 2880)) {
                    AnonymousClass6XG.A01(new C65893Tw((Set) C113725g1.A00.get(), 2), arrayList2);
                }
            } catch (Exception e) {
                Log.e("recentemoji/readrecent ", e);
                this.A01.A0E("recentemoji/load-error", e.toString(), false);
                file.delete();
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        if (arrayList == null) {
            return new ArrayList();
        }
        return arrayList;
        throw th;
    }

    public void Blb(List list) {
        JsonWriter jsonWriter;
        try {
            File file = new File(this.A00.A00.getFilesDir(), "emoji");
            C19700wN r5 = this.A01;
            jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(file)));
            jsonWriter.beginObject();
            jsonWriter.name("weights");
            jsonWriter.beginObject();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                EmojiPicker$EmojiWeight emojiPicker$EmojiWeight = (EmojiPicker$EmojiWeight) it.next();
                int[] iArr = emojiPicker$EmojiWeight.A01;
                if (iArr == null) {
                    r5.A0E("RecentEmojiHelper/persistListJson/emoji is null", (String) null, true);
                } else {
                    jsonWriter.name(C63873Lt.A01(iArr));
                    jsonWriter.value((double) emojiPicker$EmojiWeight.A00);
                }
            }
            jsonWriter.endObject();
            jsonWriter.endObject();
            jsonWriter.close();
            return;
        } catch (IOException e) {
            Log.e((Throwable) e);
            this.A01.A0E("recentemoji/save-error", e.toString(), false);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public AnonymousClass1XL(C19700wN r1, C19630wG r2, C20810yC r3) {
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = r1;
    }
}
