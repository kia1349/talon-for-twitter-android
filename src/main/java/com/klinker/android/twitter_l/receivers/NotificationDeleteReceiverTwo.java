<<<<<<< HEAD:src/main/java/com/klinker/android/twitter_l/receivers/NotificationDeleteReceiverTwo.java
package com.klinker.android.twitter_l.receivers;
=======
/*
 * Copyright 2014 Luke Klinker
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.klinker.android.twitter.receivers;
>>>>>>> master:src/main/java/com/klinker/android/twitter/receivers/NotificationDeleteReceiverTwo.java

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.klinker.android.twitter_l.services.MarkReadSecondAccService;

public class NotificationDeleteReceiverTwo extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.v("notification_deleted_talon", "starting receiver for notification deleted on account 2");
        context.startService(new Intent(context, MarkReadSecondAccService.class));
    }
}
