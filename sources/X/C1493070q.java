package X;

import android.content.Context;
import android.content.Intent;
import android.os.ParcelFileDescriptor;
import android.speech.SpeechRecognizer;
import java.io.File;

/* renamed from: X.70q  reason: invalid class name and case insensitive filesystem */
public final class C1493070q implements C158677ht {
    public final AnonymousClass17Y A00;
    public final C19630wG A01;

    public static final void A00(Context context, Intent intent, C128196Bh r7, C159737jq r8, C10810fG r9, C10810fG r10, C10810fG r11) {
        AnonymousClass00C.A0D(r7, 1);
        C36321k7.A1A(r9, r10, r11, intent, 2);
        C46812bi r4 = r7.A00;
        AnonymousClass7ID r3 = new AnonymousClass7ID(r10, r9, r11);
        C10810fG r2 = new C10810fG();
        r2.element = "";
        C135156cF r1 = new C135156cF(r4, r8, r3, r2);
        SpeechRecognizer createOnDeviceSpeechRecognizer = SpeechRecognizer.createOnDeviceSpeechRecognizer(context);
        createOnDeviceSpeechRecognizer.setRecognitionListener(r1);
        createOnDeviceSpeechRecognizer.startListening(intent);
        r9.element = createOnDeviceSpeechRecognizer;
    }

    public static final void A01(C10810fG r0, C10810fG r1, C10810fG r2) {
        ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) r0.element;
        if (parcelFileDescriptor != null) {
            parcelFileDescriptor.close();
        }
        SpeechRecognizer speechRecognizer = (SpeechRecognizer) r1.element;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        File file = (File) r2.element;
        if (file != null) {
            file.delete();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b2, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvy(X.C128196Bh r19) {
        /*
            r18 = this;
            java.lang.String r5 = "android.speech.extra.AUDIO_SOURCE"
            r4 = r18
            X.0wG r0 = r4.A01
            android.content.Context r13 = r0.A00
            X.AnonymousClass00C.A08(r13)
            r11 = r19
            X.7jq r10 = r11.A01
            java.io.InputStream r6 = r11.A02
            X.2bi r2 = r11.A00
            X.0fG r14 = new X.0fG
            r14.<init>()
            X.0fG r12 = new X.0fG
            r12.<init>()
            X.0fG r15 = new X.0fG
            r15.<init>()
            long r0 = r2.A1N     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x00b3 }
            r9 = 3
            r7 = 48
            r1 = 0
            int r0 = r8.length()     // Catch:{ Exception -> 0x00b3 }
            if (r9 > r0) goto L_0x004b
            java.lang.CharSequence r3 = r8.subSequence(r1, r0)     // Catch:{ Exception -> 0x00b3 }
        L_0x0036:
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r1 = ".pcm"
            java.io.File r0 = r13.getCacheDir()     // Catch:{ Exception -> 0x00b3 }
            java.io.File r0 = java.io.File.createTempFile(r3, r1, r0)     // Catch:{ Exception -> 0x00b3 }
            r15.element = r0     // Catch:{ Exception -> 0x00b3 }
            java.io.FileOutputStream r3 = X.C90524aI.A0W(r0)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x006b
        L_0x004b:
            java.lang.StringBuilder r3 = X.C90524aI.A0h(r9)     // Catch:{ Exception -> 0x00b3 }
            r1 = 1
            int r9 = r9 - r0
            X.0mZ r0 = new X.0mZ     // Catch:{ Exception -> 0x00b3 }
            r0.<init>(r1, r9)     // Catch:{ Exception -> 0x00b3 }
            X.0k7 r1 = r0.iterator()     // Catch:{ Exception -> 0x00b3 }
        L_0x005a:
            boolean r0 = r1.hasNext()     // Catch:{ Exception -> 0x00b3 }
            if (r0 == 0) goto L_0x0067
            r1.A00()     // Catch:{ Exception -> 0x00b3 }
            r3.append(r7)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x005a
        L_0x0067:
            r3.append(r8)     // Catch:{ Exception -> 0x00b3 }
            goto L_0x0036
        L_0x006b:
            X.AnonymousClass0Va.A00(r6, r3)     // Catch:{ all -> 0x00ac }
            r3.close()     // Catch:{ Exception -> 0x00b3 }
            java.lang.Object r1 = r15.element     // Catch:{ Exception -> 0x00b3 }
            java.io.File r1 = (java.io.File) r1     // Catch:{ Exception -> 0x00b3 }
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            android.os.ParcelFileDescriptor r0 = android.os.ParcelFileDescriptor.open(r1, r0)     // Catch:{ Exception -> 0x00b3 }
            r14.element = r0     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r0 = "android.speech.action.RECOGNIZE_SPEECH"
            android.content.Intent r3 = X.C36441kJ.A0I(r0)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r0 = "android.speech.extra.SEGMENTED_SESSION"
            r3.putExtra(r0, r5)     // Catch:{ Exception -> 0x00b3 }
            java.lang.Object r0 = r14.element     // Catch:{ Exception -> 0x00b3 }
            android.os.Parcelable r0 = (android.os.Parcelable) r0     // Catch:{ Exception -> 0x00b3 }
            r3.putExtra(r5, r0)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r1 = "android.speech.extra.AUDIO_SOURCE_SAMPLING_RATE"
            r0 = 16000(0x3e80, float:2.2421E-41)
            r3.putExtra(r1, r0)     // Catch:{ Exception -> 0x00b3 }
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r0 = "free_form"
            r3.putExtra(r1, r0)     // Catch:{ Exception -> 0x00b3 }
            X.17Y r0 = r4.A00     // Catch:{ Exception -> 0x00b3 }
            r17 = 4
            X.754 r9 = new X.754     // Catch:{ Exception -> 0x00b3 }
            r16 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x00b3 }
            r0.A0H(r9)     // Catch:{ Exception -> 0x00b3 }
            return
        L_0x00ac:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ae }
        L_0x00ae:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ Exception -> 0x00b3 }
            throw r0     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            r1 = move-exception
            java.lang.String r0 = "voicetranscription/SpeechRecognizerTranscriptionEngine/transcribe error"
            com.whatsapp.util.Log.i(r0, r1)
            A01(r14, r12, r15)
            X.5Si r0 = X.C108145Si.UNKNOWN_TRANSCRIPTION_ERROR
            r10.BjS(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1493070q.Bvy(X.6Bh):void");
    }

    public C1493070q(AnonymousClass17Y r1, C19630wG r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
