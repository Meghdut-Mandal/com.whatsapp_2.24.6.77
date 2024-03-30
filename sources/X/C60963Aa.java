package X;

import android.app.Activity;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageButton;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.whatsapp.R;
import com.whatsapp.emoji.search.EmojiSearchContainer;
import com.whatsapp.emoji.search.EmojiSearchProvider;
import com.whatsapp.mentions.MentionableEntry;
import java.util.List;

/* renamed from: X.3Aa  reason: invalid class name and case insensitive filesystem */
public class C60963Aa {
    public final View A00;
    public final ViewTreeObserver.OnGlobalLayoutListener A01;
    public final C88314Sf A02;
    public final AnonymousClass22t A03;
    public final AnonymousClass3J6 A04;
    public final MentionableEntry A05;
    public final AnonymousClass4UT A06;
    public final AnonymousClass1N2 A07;

    public C60963Aa(Activity activity, View view, C19700wN r40, C21060yb r41, C19420v0 r42, C18820ts r43, AnonymousClass141 r44, AnonymousClass1N0 r45, C1261362r r46, AnonymousClass6O1 r47, AnonymousClass1XN r48, AnonymousClass1H2 r49, EmojiSearchProvider emojiSearchProvider, C20810yC r51, AnonymousClass4UT r52, C19890wg r53, AnonymousClass1N2 r54, String str, List list, List list2, boolean z) {
        Integer num;
        C89604Xe r3 = new C89604Xe(this, 15);
        this.A02 = r3;
        C90104Zc r2 = new C90104Zc(this, 35);
        this.A01 = r2;
        View view2 = view;
        this.A00 = view2;
        AnonymousClass1N2 r6 = r54;
        this.A07 = r6;
        AnonymousClass4UT r8 = r52;
        this.A06 = r8;
        MentionableEntry mentionableEntry = (MentionableEntry) C012005e.A02(view2, R.id.caption);
        this.A05 = mentionableEntry;
        mentionableEntry.setInputEnterAction(6);
        mentionableEntry.setFilters(new InputFilter[]{new C66763Xf(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH)});
        boolean z2 = z;
        mentionableEntry.setOnKeyListener(new C67213Yy(this, z2));
        mentionableEntry.setOnEditorActionListener(new C67433Zu(r8, this, z2));
        AnonymousClass1H2 r20 = r49;
        C18820ts r16 = r43;
        C21060yb r14 = r41;
        C19890wg r23 = r53;
        mentionableEntry.addTextChangedListener(new AnonymousClass2gA(mentionableEntry, C36391kE.A0O(view2, R.id.counter), r14, r16, r45, r20, r23, EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 30, true, false, false));
        AnonymousClass141 r82 = r44;
        if (r44 != null && mentionableEntry.A0I(r82.A0H)) {
            ViewGroup A0O = C36411kG.A0O(view2, R.id.mention_attach);
            mentionableEntry.A02 = view2;
            mentionableEntry.A0G(A0O, r82.A0H, true, false, false, false);
        }
        String str2 = str;
        if (!TextUtils.isEmpty(str2)) {
            mentionableEntry.setMentionableText(str2, list);
        }
        ImageButton imageButton = (ImageButton) view2.findViewById(R.id.emoji_picker_btn);
        Activity activity2 = activity;
        C87484Oz r12 = (C87484Oz) activity2.findViewById(R.id.main);
        Integer A0i = C36401kF.A0i();
        List list3 = list2;
        if (list2 == null || list3.isEmpty()) {
            num = null;
        } else if (list3.size() == 1) {
            num = C54212sa.A00((AnonymousClass11F) list3.get(0));
        } else {
            num = C36401kF.A0h();
        }
        AnonymousClass6O1 r18 = r47;
        C1261362r r17 = r46;
        C19420v0 r15 = r42;
        C19700wN r11 = r40;
        AnonymousClass22t r83 = new AnonymousClass22t(activity2, imageButton, r11, r12, mentionableEntry, r14, r15, r16, r17, r18, r48, r20, emojiSearchProvider, r51, r23, r6, A0i, num);
        this.A03 = r83;
        r83.A00 = R.drawable.ib_emoji;
        r83.A03 = R.drawable.ib_keyboard;
        AnonymousClass3UF.A0B(imageButton.getContext(), imageButton, R.drawable.ib_emoji, R.color.f6nameremoved);
        AnonymousClass3J6 r5 = new AnonymousClass3J6(activity2, r83, (EmojiSearchContainer) view2.findViewById(R.id.emoji_search_container));
        this.A04 = r5;
        AnonymousClass3J6.A00(r5, this, 11);
        r83.A0H(r3);
        r83.A0F = C81183wb.A00(this, 42);
        view2.getViewTreeObserver().addOnGlobalLayoutListener(r2);
    }
}
