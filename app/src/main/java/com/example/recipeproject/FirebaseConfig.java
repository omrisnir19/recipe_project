package com.example.recipeproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;

/**
 * פרק 11, סעיף "מכינים את הפרויקט ל-Firebase" — החיבור לענן בלי google-services.json.
 *
 * בפרויקט "רגיל" מורידים מהקונסולה קובץ בשם google-services.json ומניחים אותו בתיקיית app.
 * התוסף com.google.gms.google-services קורא ממנו את הפרטים ומייצר את החיבור לבד.
 * הבעיה: הקובץ הזה שייך לחשבון Firebase מסוים, ובלעדיו הפרויקט אפילו לא מתקמפל.
 *
 * לכן בפרויקט הזה **אין תוסף ואין קובץ json**. במקומם ממלאים כאן שלושה קבועים,
 * ובונים את אותו חיבור בדיוק בקוד, דרך FirebaseOptions.Builder.
 * כל עוד הקבועים ריקים — האפליקציה עובדת רגיל, המסכים של SharedPreferences והקבצים
 * פועלים במלואם, ומסכי הענן מפנים למסך הסבר במקום לקרוס.
 *
 * === מאיפה לוקחים כל ערך ===
 * נכנסים ל-https://console.firebase.google.com, בוחרים את הפרויקט שלכם,
 * ולוחצים על גלגל השיניים ⚙ ליד Project Overview ← Project settings ← לשונית General.
 * גוללים למטה אל "Your apps" ובוחרים את אפליקציית האנדרואיד שרשמתם.
 *
 *   API_KEY        — בכרטיס האפליקציה, השדה "Web API Key" (או "Api key" בקובץ ה-json,
 *                    תחת api_key → current_key). מחרוזת שמתחילה ב-AIza...
 *   APPLICATION_ID — באותו כרטיס, השדה "App ID". נראה כך: 1:123456789012:android:abc123def456
 *   DATABASE_URL   — בתפריט הצד: Build ← Realtime Database. הכתובת מופיעה בראש הטבלה,
 *                    בצורה https://<שם-הפרויקט>-default-rtdb.europe-west1.firebasedatabase.app
 *
 * שימו לב: שם החבילה שרשמתם בקונסולה חייב להיות בדיוק com.ort.tivon.ch11 —
 * זה ה-applicationId שמופיע ב-app/build.gradle.kts.
 */
public final class FirebaseConfig {

    // ↓↓↓ שלושת הערכים שהתלמיד ממלא. השאירו את הגרשיים, הדביקו בין הגרשיים. ↓↓↓

    /** "Web API Key" ממסך Project settings ← General. מתחיל ב-AIza */
    public static final String API_KEY = "AIzaSyAYQe5DfebVA7ByFlKR2m3pwm6XsNPrTcY";

    /** "App ID" של אפליקציית האנדרואיד. בצורה 1:000000000000:android:0000000000000000 */
    public static final String APPLICATION_ID = "1:91150032042:android:dae8560c68135bccfe44d3";

    /** כתובת ה-Realtime Database ממסך Build ← Realtime Database */
    public static final String DATABASE_URL = "https://recipe-project-4204c-default-rtdb.europe-west1.firebasedatabase.app/";
}
