package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3cr  reason: invalid class name and case insensitive filesystem */
public final class C69033cr implements C19710wO {
    public final AnonymousClass1JL A00;

    public C69033cr(AnonymousClass1JL r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public String BIB() {
        return "SplitWindowAsyncInit";
    }

    public /* synthetic */ void BRM() {
    }

    public void BRL() {
        AnonymousClass1JL r4 = this.A00;
        if (r4.A08()) {
            Context context = r4.A03;
            String packageName = context.getPackageName();
            AnonymousClass00C.A08(packageName);
            Set A02 = AnonymousClass02N.A02("com.whatsapp.HomeActivity", "com.whatsapp.Conversation", "com.whatsapp.home.ui.HomePlaceholderActivity");
            if (C36331k8.A1b(r4.A05)) {
                A02.add("com.whatsapp.chatinfo.ContactInfoActivity");
                A02.add("com.whatsapp.group.GroupChatInfoActivity");
                A02.add("com.whatsapp.chatinfo.ListChatInfoActivity");
                A02.add("com.whatsapp.newsletter.NewsletterInfoActivity");
                A02.add("com.whatsapp.gallery.MediaGalleryActivity");
            }
            if (C36331k8.A1b(r4.A07)) {
                A02.add("com.whatsapp.conversation.conversationrow.message.StarredMessagesActivity");
                A02.add("com.whatsapp.home.ui.StarredMessagesPlaceholderActivity");
            }
            A02.add("com.whatsapp.conversation.selection.SingleSelectedMessageActivity");
            A02.add("com.whatsapp.conversation.selection.SelectedImageAndVideoAlbumActivity");
            HashSet A16 = C36441kJ.A16();
            try {
                ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(packageName, 1).activities;
                if (activityInfoArr != null) {
                    for (ActivityInfo activityInfo : activityInfoArr) {
                        if (!A02.contains(activityInfo.name)) {
                            A16.add(new ComponentName(packageName, activityInfo.name));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("SplitWindowManager/getActivitiesToExpand/ failed to get activities from the packagemanager", e);
            }
            ArrayList A0J = C36321k7.A0J(A16);
            Iterator it = A16.iterator();
            while (it.hasNext()) {
                A0J.add(new AnonymousClass9V7((ComponentName) it.next()));
            }
            ((C201089ip) r4.A08.getValue()).A00(new C42861zc(new C56902xH(C007103b.A0f(A0J)).A00));
        }
    }
}
