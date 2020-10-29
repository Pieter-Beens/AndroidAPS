package info.nightscout.androidaps.plugins.constraints.objectives.objectives;

import java.util.Collections;
import java.util.List;

import dagger.android.HasAndroidInjector;
import info.nightscout.androidaps.MainApp;
import info.nightscout.androidaps.R;

public class Objective2 extends Objective {


    public Objective2(HasAndroidInjector injector) {
        super(injector, "exam", R.string.objectives_exam_objective, R.string.objectives_exam_gate);
        for (Task task : tasks) {
            if (!task.isCompleted()) setAccomplishedOn(0);
        }
    }

    @Override
    protected void setupTasks(List<Task> tasks) {
        tasks.add(new ExamTask(R.string.dia_label_exam, R.string.dia_whatmeansdia,"dia")
                .option(new Option(R.string.dia_profile, true))
                .option(new Option(R.string.dia_minimumis5h, true))
                .option(new Option(R.string.dia_meaningisequaltodiapump, false))
                .option(new Option(R.string.dia_valuemustbedetermined, true))
                .hint(new Hint(R.string.dia_hint1))
        );
        tasks.add(new ExamTask(R.string.hypott_label, R.string.hypott_whenhypott,"hypott")
                .option(new Option(R.string.hypott_goinglow, false))
                .option(new Option(R.string.hypott_exercise, false))
                .option(new Option(R.string.hypott_preventoversmb, true))
                .option(new Option(R.string.hypott_0basal, false))
                .hint(new Hint(R.string.hypott_hint1))
        );
        tasks.add(new ExamTask(R.string.offlineprofile_label, R.string.offlineprofile_whatprofile,"offlineprofile")
                .option(new Option(R.string.localprofile, true))
                .option(new Option(R.string.nsprofile, false))
                .option(new Option(R.string.offlineprofile_nsprofile, true))
                .hint(new Hint(R.string.offlineprofile_hint1))
        );
        tasks.add(new ExamTask(R.string.pumpdisconnect_label, R.string.pumpdisconnect_label,"pumpdisconnect")
                .option(new Option(R.string.pumpdisconnect_unnecessary, false))
                .option(new Option(R.string.pumpdisconnect_missinginsulin, true))
                .option(new Option(R.string.pumpdisconnect_notstop, false))
                .option(new Option(R.string.pumpdisconnect_openloop, false))
                .hint(new Hint(R.string.pumpdisconnect_hint1))
        );
        tasks.add(new ExamTask(R.string.objectives_label, R.string.objectives_howtosave,"objectives")
                .option(new Option(R.string.objectives_exportsettings, true))
                .option(new Option(R.string.objectives_storeelsewhere, true))
                .option(new Option(R.string.objectives_doexportonstart, false))
                .option(new Option(R.string.objectives_doexportafterchange, true))
                .option(new Option(R.string.objectives_doexportafterobjective, true))
                .option(new Option(R.string.objectives_doexportafterfirtssettings, true))
                .hint(new Hint(R.string.objectives_hint1))
                .hint(new Hint(R.string.objectives_hint2))
        );
        tasks.add(new ExamTask(R.string.noisycgm_label, R.string.noisycgm_whattodo,"noisycgm")
                .option(new Option(R.string.nothing, false))
                .option(new Option(R.string.disconnectpumpfor1h, false))
                .option(new Option(R.string.noisycgm_pause, true))
                .option(new Option(R.string.noisycgm_replacesensor, true))
                .option(new Option(R.string.noisycgm_turnoffphone, false))
                .option(new Option(R.string.noisycgm_checksmoothing, true))
                .hint(new Hint(R.string.noisycgm_hint1))
        );
        tasks.add(new ExamTask(R.string.exerciseprofile_label, R.string.exercise_whattodo,"exercise")
                .option(new Option(R.string.exerciseprofile_switchprofileabove100, false))
                .option(new Option(R.string.exerciseprofile_switchprofilebelow100, true))
                .option(new Option(R.string.exerciseprofile_suspendloop, false))
                .option(new Option(R.string.exerciseprofile_suspendloop, false))
                .hint(new Hint(R.string.exerciseprofile_hint1))
        );
        tasks.add(new ExamTask(R.string.exercise_label, R.string.exercise_whattodo,"exercise")
                .option(new Option(R.string.exercise_settt, false))
                .option(new Option(R.string.exercise_setfinished, true))
                .option(new Option(R.string.exercise_setunchanged, false))
                .option(new Option(R.string.exercise_15g, false))
                .hint(new Hint(R.string.exercise_hint1))
        );
       tasks.add(new ExamTask(R.string.suspendloop_label, R.string.suspendloop_doigetinsulin,"suspendloop")
                .option(new Option(R.string.suspendloop_yes, true))
                .option(new Option(R.string.suspendloop_no, false))
        );
       tasks.add(new ExamTask(R.string.basaltest_label, R.string.basaltest_when,"basaltest")
                .option(new Option(R.string.basaltest_fixed, false))
                .option(new Option(R.string.basaltest_havingregularhighlow, true))
                .option(new Option(R.string.basaltest_weekly, false))
               .option(new Option(R.string.basaltest_beforeloop, true))
                 .hint(new Hint(R.string.basaltest_hint1))
        );
       tasks.add(new ExamTask(R.string.basalhelp_label, R.string.basalhelp_where,"basalhelp")
                .option(new Option(R.string.basalhelp_diabetesteam, true))
                .option(new Option(R.string.basalhelp_google, false))
                .option(new Option(R.string.basalhelp_facebook, false))
                 .hint(new Hint(R.string.basalhelp_hint1))
        );
       tasks.add(new ExamTask(R.string.prerequisites_label, R.string.prerequisites_what, "prerequisites")
               .option(new Option(R.string.prerequisites_nightscout, true))
               .option(new Option(R.string.prerequisites_computer, true))
               .option(new Option(R.string.prerequisites_pump, true))
               .option(new Option(R.string.prerequisites_beanandroiddeveloper, false))
                .hint(new Hint(R.string.prerequisites_hint1))
        );
        tasks.add(new ExamTask(R.string.prerequisites2_label, R.string.prerequisites2_what, "prerequisites")
                .option(new Option(R.string.prerequisites2_profile, true))
                .option(new Option(R.string.prerequisites2_device, true))
                .option(new Option(R.string.prerequisites2_internet, false))
                .option(new Option(R.string.prerequisites2_supportedcgm, true))
                .hint(new Hint(R.string.prerequisites2_hint1))
        );
                tasks.add(new ExamTask(R.string.update_label, R.string.whatistrue,"update")
                .option(new Option(R.string.update_git, true))
                .option(new Option(R.string.update_askfriend, false))
                .option(new Option(R.string.update_keys, true))
                .option(new Option(R.string.update_asap, false))
                .hint(new Hint(R.string.update_hint1))
        );
        tasks.add(new ExamTask(R.string.troubleshooting_label, R.string.troubleshooting_wheretoask,"troubleshooting")
                .option(new Option(R.string.troubleshooting_fb, true))
                .option(new Option(R.string.troubleshooting_wiki, true))
                .option(new Option(R.string.troubleshooting_gitter, true))
                .option(new Option(R.string.troubleshooting_yourendo, false))
                .hint(new Hint(R.string.troubleshooting_hint1))
                .hint(new Hint(R.string.troubleshooting_hint2))
                .hint(new Hint(R.string.troubleshooting_hint3))
        );
        tasks.add(new ExamTask(R.string.insulin_label, R.string.insulin_ultrarapid,"insulin")
                .option(new Option(R.string.insulin_novorapid, false))
                .option(new Option(R.string.insulin_humalog, false))
                .option(new Option(R.string.insulin_actrapid, false))
                .option(new Option(R.string.insulin_fiasp, true))
                .hint(new Hint(R.string.insulin_hint1))
        );
        tasks.add(new ExamTask(R.string.sensitivity_label, R.string.sensitivity_which,"sensitivity")
                .option(new Option(R.string.sensitivityweightedaverage, true))
                .option(new Option(R.string.sensitivityoref1, false))
                .option(new Option(R.string.sensitivityaaps, true))
                .hint(new Hint(R.string.sensitivity_hint1))
        );
        tasks.add(new ExamTask(R.string.sensitivity_label, R.string.sensitivityuam_which,"sensitivityuam")
                .option(new Option(R.string.sensitivityweightedaverage, false))
                .option(new Option(R.string.sensitivityoref1, true))
                .option(new Option(R.string.sensitivityaaps, false))
                .hint(new Hint(R.string.sensitivity_hint1))
        );
        tasks.add(new ExamTask(R.string.wrongcarbs_label, R.string.wrongcarbs_whattodo,"wrongcarbs")
                .option(new Option(R.string.wrongcarbs_addfakeinsulin, false))
                .option(new Option(R.string.wrongcarbs_treatmentstab, true))
        );
        tasks.add(new ExamTask(R.string.extendedcarbs_label, R.string.extendedcarbs_handling,"extendedcarbs")
                .option(new Option(R.string.extendedcarbs_useextendedcarbs, true))
                .option(new Option(R.string.extendedcarbs_add, false))
                .option(new Option(R.string.extendedcarbs_useextendedbolus, false))
                .hint(new Hint(R.string.extendedcarbs_hint1))
        );
        tasks.add(new ExamTask(R.string.nsclient_label, R.string.nsclient_howcanyou,"nsclient")
                .option(new Option(R.string.nsclient_nightscout, true))
                .option(new Option(R.string.nsclientinternal, true))
                .option(new Option(R.string.nsclient_dexcomfollow, true))
                .option(new Option(R.string.nsclient_dexcomfollowxdrip, false))
                .option(new Option(R.string.nsclient_xdripfollower, true))
                .option(new Option(R.string.nsclient_looponiphone, false))
                .option(new Option(R.string.nsclient_spikeiphone, true))
                .hint(new Hint(R.string.nsclient_hint1))
        );
        tasks.add(new ExamTask(R.string.isf_label_exam, R.string.whatistrue,"isf")
                .option(new Option(R.string.isf_decreasingvalue, true))
                .option(new Option(R.string.isf_preferences, false))
                .option(new Option(R.string.isf_increasingvalue, false))
                .option(new Option(R.string.isf_noeffect, false))
                .option(new Option(R.string.isf_profile, false))
                .hint(new Hint(R.string.isf_hint1))
                .hint(new Hint(R.string.isf_hint2))
        );
        tasks.add(new ExamTask(R.string.ic_label_exam, R.string.whatistrue,"ic")
                .option(new Option(R.string.ic_increasingvalue, false))
                .option(new Option(R.string.ic_decreasingvalue, true))
                .option(new Option(R.string.ic_multiple, true))
                .option(new Option(R.string.ic_isf, false))
                .hint(new Hint(R.string.ic_hint1))
        );
        tasks.add(new ExamTask(R.string.profileswitch_label, R.string.profileswitch_pctwillchange,"profileswitch")
                .option(new Option(R.string.profileswitch_basalhigher, false))
                .option(new Option(R.string.profileswitch_basallower, true))
                .option(new Option(R.string.profileswitch_ichigher, true))
                .option(new Option(R.string.profileswitch_iclower, false))
                .option(new Option(R.string.profileswitch_isfhigher, true))
                .option(new Option(R.string.profileswitch_isflower, false))
                .option(new Option(R.string.profileswitch_overall, true))
                .option(new Option(R.string.profileswitch_targethigher, false))
                .option(new Option(R.string.profileswitch_targetlower, false))
                .option(new Option(R.string.profileswitch_targetbottom, false))
                .hint(new Hint(R.string.profileswitch_hint1))
        );

        tasks.add(new ExamTask(R.string.profileswitch_label, R.string.profileswitchtime_iwant,"profileswitchtime")
                .option(new Option(R.string.profileswitchtime_2, false))
                .option(new Option(R.string.profileswitchtime__2, true))
                .option(new Option(R.string.profileswitchtime_tt, false))
                .option(new Option(R.string.profileswitchtime_100, false))
                .hint(new Hint(R.string.profileswitchtime_hint1))
        );

        tasks.add(new ExamTask(R.string.other_medication_label, R.string.other_medication_text,"otherMedicationWarning")
                .option(new Option(R.string.yes, true))
                .option(new Option(R.string.no, false))
        );

        for (Task task : tasks)
            Collections.shuffle(((ExamTask)task).options);
    }

}
