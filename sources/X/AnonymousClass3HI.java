package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.3HI  reason: invalid class name */
public class AnonymousClass3HI {
    public boolean A00;
    public final Context A01;
    public final LayoutInflater A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ImageView A06;
    public final WaTextView A07;
    public final AnonymousClass171 A08;
    public final AnonymousClass1RY A09;
    public final C18820ts A0A;
    public final C220412q A0B;
    public final WDSButton A0C;
    public final WDSButton A0D;
    public final ViewGroup A0E;
    public final TextView A0F;
    public final TextView A0G;
    public final TextView A0H;
    public final RecyclerView A0I;
    public final TextEmojiLabel A0J;
    public final TextEmojiLabel A0K;
    public final AnonymousClass16D A0L;
    public final C19970wo A0M;
    public final C20810yC A0N;
    public final C40811w9 A0O;
    public final AnonymousClass1EM A0P;

    public void A00(Bitmap bitmap) {
        if (bitmap == null) {
            Log.e("GroupInviteInfoViewController/decode-photo-bytes-returns-null");
            return;
        }
        AlphaAnimation A0L2 = C36371kC.A0L();
        A0L2.setDuration(100);
        C89214Vr.A00(A0L2, this, bitmap, 12);
        this.A06.startAnimation(A0L2);
    }

    public void A01(AnonymousClass3B2 r20, long j) {
        AnonymousClass141 r11;
        String str;
        int i;
        AnonymousClass3B2 r10 = r20;
        UserJid userJid = r10.A06;
        if (userJid != null) {
            r11 = this.A0L.A0D(userJid);
        } else {
            r11 = null;
        }
        this.A0K.A0I(r10.A09);
        if (r11 == null || !this.A00) {
            this.A0F.setVisibility(8);
        } else {
            TextView textView = this.A0F;
            textView.setVisibility(0);
            boolean A032 = this.A0P.A03(r10.A02);
            int i2 = R.string.f12nameremoved;
            if (A032) {
                i2 = R.string.f12nameremoved;
            }
            C36341k9.A0s(this.A01, textView, new Object[]{this.A08.A0M(r11)}, i2);
        }
        AnonymousClass3QL r0 = r10.A07;
        if (r0 == null) {
            str = null;
        } else {
            str = r0.A03;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        TextEmojiLabel textEmojiLabel = this.A0J;
        if (!isEmpty) {
            textEmojiLabel.A0I(str);
            textEmojiLabel.setVisibility(0);
        } else {
            textEmojiLabel.setVisibility(8);
        }
        List list = r10.A0A;
        boolean A1a = C36401kF.A1a(list);
        TextView textView2 = this.A0H;
        textView2.setVisibility(C36351kA.A00(A1a ? 1 : 0));
        this.A0E.setVisibility(C36381kD.A00(A1a));
        this.A0I.setVisibility(C36351kA.A00(A1a));
        C18820ts r14 = this.A0A;
        int i3 = r10.A03;
        long j2 = (long) i3;
        Integer valueOf = Integer.valueOf(i3);
        textView2.setText(r14.A0L(new Object[]{valueOf}, R.plurals.f10nameremoved, j2));
        this.A0G.setText(r14.A0L(new Object[]{valueOf}, R.plurals.f10nameremoved, j2));
        C40811w9 r02 = this.A0O;
        r02.A01 = list;
        r02.A06();
        r02.A00 = i3;
        r02.A06();
        int i4 = r10.A02;
        if (i4 == 1 || i4 == 2 || i4 == 6 || i4 == 3) {
            WaTextView waTextView = this.A07;
            waTextView.setVisibility(0);
            if (this.A0N.A0E(5021)) {
                i = R.string.f12nameremoved;
                if (i4 != 1) {
                    i = R.string.f12nameremoved;
                }
            } else {
                i = R.string.f12nameremoved;
            }
            waTextView.setText(i);
            waTextView.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            waTextView.A0C();
        } else {
            long A002 = C19970wo.A00(this.A0M);
            long j3 = j;
            int i5 = ((j - A002) > 0 ? 1 : ((j - A002) == 0 ? 0 : -1));
            WaTextView waTextView2 = this.A07;
            if (i5 > 0) {
                waTextView2.setText(AnonymousClass3UY.A00(this.A01, r14, j3, A002));
                waTextView2.setVisibility(0);
            } else {
                waTextView2.setVisibility(8);
            }
        }
        View view = this.A03;
        view.getViewTreeObserver().addOnGlobalLayoutListener(new AnonymousClass3ZI(this, C36441kJ.A02(view)));
        this.A05.setVisibility(0);
    }

    public AnonymousClass3HI(Context context, ViewGroup viewGroup, AnonymousClass16D r6, AnonymousClass171 r7, AnonymousClass1RY r8, C19970wo r9, C18820ts r10, C220412q r11, C20810yC r12, AnonymousClass1EM r13) {
        this.A01 = context;
        this.A0M = r9;
        this.A0N = r12;
        this.A0B = r11;
        this.A02 = LayoutInflater.from(context);
        this.A0L = r6;
        this.A08 = r7;
        this.A0A = r10;
        this.A0P = r13;
        this.A09 = r8;
        this.A0F = C36391kE.A0P(viewGroup, R.id.group_creator);
        this.A0K = C36401kF.A0P(viewGroup, R.id.group_name);
        this.A0J = C36401kF.A0P(viewGroup, R.id.group_description_preview);
        this.A0E = C36411kG.A0P(viewGroup, R.id.participants_no_known_contacts);
        this.A0H = C36391kE.A0P(viewGroup, R.id.participants_header);
        this.A0G = C36391kE.A0P(viewGroup, R.id.participant_count);
        this.A06 = C36391kE.A0N(viewGroup, R.id.group_photo);
        this.A07 = C36411kG.A0Z(viewGroup, R.id.invite_expiration_time);
        this.A05 = viewGroup.findViewById(R.id.group_photo_container);
        this.A04 = viewGroup.findViewById(R.id.group_info);
        this.A03 = viewGroup.findViewById(R.id.background);
        this.A0C = C36431kI.A0y(viewGroup, R.id.invite_accept);
        this.A0D = C36431kI.A0y(viewGroup, R.id.invite_ignore);
        RecyclerView A0c = C36441kJ.A0c(viewGroup, R.id.group_participants);
        this.A0I = A0c;
        LinearLayoutManager A0T = C36431kI.A0T();
        A0T.A1f(0);
        A0c.setLayoutManager(A0T);
        C40811w9 r0 = new C40811w9(this);
        this.A0O = r0;
        A0c.setAdapter(r0);
    }
}
