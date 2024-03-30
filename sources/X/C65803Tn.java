package X;

import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.audiopicker.AudioPickerActivity;
import com.whatsapp.components.SelectionCheckView;
import java.io.File;
import java.util.LinkedHashMap;

/* renamed from: X.3Tn  reason: invalid class name and case insensitive filesystem */
public class C65803Tn {
    public final int A00;
    public final View A01;
    public final View A02;
    public final FrameLayout A03;
    public final ImageButton A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final SelectionCheckView A0A;
    public final CircularProgressBar A0B;
    public final /* synthetic */ AudioPickerActivity A0C;

    public C65803Tn(View view, AudioPickerActivity audioPickerActivity, int i) {
        this.A0C = audioPickerActivity;
        this.A00 = i;
        this.A02 = view;
        this.A03 = (FrameLayout) view.findViewById(R.id.audio_file_thumb_frame);
        this.A05 = C36391kE.A0N(view, R.id.audio_file_thumb);
        this.A0A = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A09 = C36391kE.A0P(view, R.id.audio_file_title);
        this.A06 = C36391kE.A0P(view, R.id.audio_file_artist);
        this.A07 = C36391kE.A0P(view, R.id.audio_file_duration);
        this.A08 = C36391kE.A0P(view, R.id.audio_file_size);
        this.A01 = view.findViewById(R.id.bullet_duration_size);
        this.A04 = (ImageButton) view.findViewById(R.id.audio_file_play_btn);
        this.A0B = (CircularProgressBar) view.findViewById(R.id.progress_bar);
    }

    public static void A00(Context context, C65803Tn r5) {
        ImageButton imageButton = r5.A04;
        AudioPickerActivity audioPickerActivity = r5.A0C;
        C36331k8.A0q(audioPickerActivity, imageButton, R.string.f12nameremoved);
        imageButton.setBackground((Drawable) null);
        C36321k7.A0L(context, imageButton, audioPickerActivity.A00, R.drawable.pause);
        AnonymousClass3UF.A0E(imageButton, C36351kA.A01(audioPickerActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
        r5.A0B.setVisibility(0);
    }

    public static void A01(Context context, C65803Tn r5, boolean z) {
        CircularProgressBar circularProgressBar;
        int i;
        ImageButton imageButton = r5.A04;
        AudioPickerActivity audioPickerActivity = r5.A0C;
        C36331k8.A0q(audioPickerActivity, imageButton, R.string.f12nameremoved);
        if (z) {
            C36361kB.A0z(context, imageButton, audioPickerActivity.A00, R.drawable.audio_picker_row_start_button_background);
            C36321k7.A0L(context, imageButton, audioPickerActivity.A00, R.drawable.play_button_audio);
            AnonymousClass3UF.A0E(imageButton, AnonymousClass00F.A00(audioPickerActivity, R.color.f6nameremoved));
            circularProgressBar = r5.A0B;
            i = 8;
        } else {
            imageButton.setBackground((Drawable) null);
            C36321k7.A0L(context, imageButton, audioPickerActivity.A00, R.drawable.toggle_play);
            AnonymousClass3UF.A0E(imageButton, C36351kA.A01(audioPickerActivity, R.attr.f4nameremoved, R.color.f6nameremoved));
            circularProgressBar = r5.A0B;
            i = 0;
        }
        circularProgressBar.setVisibility(i);
    }

    public static void A02(View view, C65803Tn r13) {
        String A0g;
        AnonymousClass17Y r6;
        String string;
        AudioPickerActivity audioPickerActivity = r13.A0C;
        C38041nc r1 = audioPickerActivity.A03;
        C60983Ac A002 = C38041nc.A00((Cursor) r1.getItem(r13.A00), r1);
        if (A002 != null) {
            int A072 = audioPickerActivity.A0D.A07(2614);
            if (audioPickerActivity.A0L.size() >= A072) {
                A072 = audioPickerActivity.A0D.A07(2693);
            }
            LinkedHashMap linkedHashMap = audioPickerActivity.A0L;
            if (linkedHashMap.size() >= A072 && !linkedHashMap.containsKey(Integer.valueOf(A002.A06))) {
                r6 = audioPickerActivity.A05;
                string = C36331k8.A0g(audioPickerActivity.A00, A072, 0, R.plurals.f10nameremoved);
            } else if (((long) A002.A00) >= C36441kJ.A0B(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS) {
                r6 = audioPickerActivity.A05;
                Object[] objArr = new Object[1];
                AnonymousClass000.A1L(objArr, audioPickerActivity.A0D.A07(3657), 0);
                string = audioPickerActivity.getString(R.string.f12nameremoved, objArr);
            } else {
                int i = A002.A06;
                LinkedHashMap linkedHashMap2 = audioPickerActivity.A0L;
                Integer valueOf = Integer.valueOf(i);
                boolean containsKey = linkedHashMap2.containsKey(valueOf);
                r13.A03(A002, !containsKey);
                LinkedHashMap linkedHashMap3 = audioPickerActivity.A0L;
                if (containsKey) {
                    linkedHashMap3.remove(valueOf);
                    view.setSelected(false);
                    view.setBackgroundResource(0);
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A04(false, true);
                } else {
                    linkedHashMap3.put(valueOf, A002);
                    view.setSelected(true);
                    view.setBackgroundResource(C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
                    ((SelectionCheckView) view.findViewById(R.id.selection_check)).A04(true, true);
                }
                int size = audioPickerActivity.A0L.size();
                ImageButton imageButton = audioPickerActivity.A01;
                if (size == 0) {
                    AnonymousClass3MU.A01(imageButton, false, true);
                    A0g = audioPickerActivity.getString(R.string.f12nameremoved);
                } else {
                    AnonymousClass3MU.A01(imageButton, true, true);
                    A0g = C36331k8.A0g(audioPickerActivity.A00, size, 0, R.plurals.f10nameremoved);
                }
                AnonymousClass07B supportActionBar = audioPickerActivity.getSupportActionBar();
                C18740tg.A07(supportActionBar, "supportActionBar is null");
                supportActionBar.A0P(A0g);
                return;
            }
            r6.A0E(string, 0);
        }
    }

    private void A03(C60983Ac r11, boolean z) {
        int i;
        Object[] objArr;
        String str = r11.A01;
        View view = this.A02;
        AudioPickerActivity audioPickerActivity = this.A0C;
        if (str != null) {
            i = R.string.f12nameremoved;
            if (z) {
                i = R.string.f12nameremoved;
            }
            objArr = new Object[]{r11.A07, str, r11.A03, r11.A05};
        } else {
            int i2 = R.string.f12nameremoved;
            if (z) {
                i2 = R.string.f12nameremoved;
            }
            objArr = new Object[]{r11.A07, r11.A03, r11.A05};
        }
        C36371kC.A14(audioPickerActivity, view, objArr, i);
    }

    public void A04(C225314u r23, C60983Ac r24) {
        long A0A2;
        TextView textView;
        float f;
        View view = this.A02;
        C66923Xv.A01(view, this, 34);
        C89564Xa.A00(view, this, 2);
        C60983Ac r5 = r24;
        String str = r5.A02;
        File file = null;
        if (str != null) {
            file = new File(str);
        }
        int i = r5.A06;
        int i2 = i;
        C74893mL r2 = new C74893mL(this, (long) i);
        C74923mO r1 = new C74923mO(this);
        AudioPickerActivity audioPickerActivity = this.A0C;
        audioPickerActivity.A0D.A02(r2, r1);
        ImageView imageView = this.A05;
        imageView.setClipToOutline(true);
        C36411kG.A1D(imageView);
        TextView textView2 = this.A09;
        C225314u r7 = r23;
        textView2.setText(C65783Tl.A03(r7, audioPickerActivity.A00, r5.A07, audioPickerActivity.A0K));
        String str2 = r5.A01;
        TextView textView3 = this.A06;
        if (str2 != null) {
            textView3.setVisibility(0);
            textView3.setText(C65783Tl.A03(r7, audioPickerActivity.A00, str2, audioPickerActivity.A0K));
        } else {
            textView3.setVisibility(8);
        }
        String str3 = r5.A04;
        boolean isEmpty = str3.isEmpty();
        TextView textView4 = this.A07;
        if (!isEmpty) {
            textView4.setVisibility(0);
            textView4.setText(str3);
        } else {
            textView4.setVisibility(8);
        }
        String str4 = r5.A05;
        boolean isEmpty2 = str4.isEmpty();
        if (!isEmpty2) {
            if (((long) r5.A00) >= C36441kJ.A0B(audioPickerActivity.A0D, 3657) * SearchActionVerificationClientService.MS_TO_NS) {
                SpannableString A0O = C36441kJ.A0O(str4);
                A0O.setSpan(new ForegroundColorSpan(-65536), 0, str4.length(), 33);
                textView = this.A08;
                C36431kI.A1M(textView, A0O);
                f = 0.5f;
            } else {
                textView = this.A08;
                textView.setText(str4);
                f = 1.0f;
            }
            textView2.setAlpha(f);
            textView.setVisibility(0);
        } else {
            this.A08.setVisibility(8);
        }
        if (isEmpty || isEmpty2) {
            this.A01.setVisibility(8);
        } else {
            this.A01.setVisibility(0);
        }
        boolean containsKey = audioPickerActivity.A0L.containsKey(Integer.valueOf(i2));
        if (containsKey) {
            view.setSelected(true);
            view.setBackgroundResource(C224514j.A00(view.getContext(), R.attr.f4nameremoved, R.color.f6nameremoved));
            SelectionCheckView selectionCheckView = this.A0A;
            selectionCheckView.setVisibility(0);
            selectionCheckView.A04(true, false);
        } else {
            view.setBackgroundResource(0);
            SelectionCheckView selectionCheckView2 = this.A0A;
            selectionCheckView2.A04(false, false);
            selectionCheckView2.setVisibility(4);
        }
        A03(r5, containsKey);
        CircularProgressBar circularProgressBar = this.A0B;
        circularProgressBar.A09 = AnonymousClass00F.A00(r7, R.color.f6nameremoved);
        circularProgressBar.A0A = C36351kA.A01(r7, R.attr.f4nameremoved, R.color.f6nameremoved);
        circularProgressBar.A05 = 0.1f;
        circularProgressBar.A06 = 10.0f;
        circularProgressBar.setIndeterminate(false);
        String num = Integer.toString(i2);
        int i3 = C148826zU.A12;
        C46812bi r9 = new C46812bi(new C64933Qa((AnonymousClass11F) null, num, true), 0);
        r9.A09 = 2;
        C65013Qj r0 = new C65013Qj();
        r0.A0I = file;
        r9.A01 = r0;
        if (!audioPickerActivity.A0B.A0D(r9)) {
            A01(r7, this, true);
            circularProgressBar.setMax(r9.A0B * 1000);
            circularProgressBar.setProgress(0);
            A0A2 = 0;
        } else {
            C148826zU A002 = audioPickerActivity.A0B.A00();
            if (A002 != null) {
                circularProgressBar.setMax(A002.A01);
                if (A002.A0I()) {
                    A00(r7, this);
                } else if (A002.A0A() > 0) {
                    A01(r7, this, false);
                } else {
                    A01(r7, this, true);
                    circularProgressBar.setProgress(0);
                    circularProgressBar.setMax(A002.A01);
                    A002.A0G = new C70663fW(r7, this, A002, r9);
                    A0A2 = (long) A002.A0A();
                }
                circularProgressBar.setProgress(A002.A0A());
                circularProgressBar.setMax(A002.A01);
                A002.A0G = new C70663fW(r7, this, A002, r9);
                A0A2 = (long) A002.A0A();
            }
            this.A04.setOnClickListener(new AnonymousClass3YT(this, r9, r5, r7, 0));
        }
        circularProgressBar.setContentDescription(C36351kA.A0w(audioPickerActivity, AnonymousClass3UY.A0A(audioPickerActivity.A00, A0A2), 1, R.string.f12nameremoved));
        this.A04.setOnClickListener(new AnonymousClass3YT(this, r9, r5, r7, 0));
    }
}
