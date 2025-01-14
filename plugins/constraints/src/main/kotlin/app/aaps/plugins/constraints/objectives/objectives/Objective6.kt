package app.aaps.plugins.constraints.objectives.objectives

import app.aaps.core.interfaces.aps.ApsMode
import app.aaps.core.interfaces.constraints.ConstraintsChecker
import app.aaps.core.interfaces.utils.T
import app.aaps.plugins.constraints.R
import dagger.android.HasAndroidInjector
import javax.inject.Inject

@Suppress("SpellCheckingInspection")
class Objective6(injector: HasAndroidInjector) : Objective(injector, "maxiob", R.string.objectives_maxiob_objective, R.string.objectives_maxiob_gate) {

    @Inject lateinit var constraintChecker: ConstraintsChecker

    init {
        tasks.add(MinimumDurationTask(this, T.secs(1).msecs()))
        tasks.add(
            object : Task(this, R.string.closedmodeenabled) {
                override fun isCompleted(): Boolean {
                    // return ApsMode.fromString(sp.getString(app.aaps.core.utils.R.string.key_aps_mode, ApsMode.OPEN.name)) == ApsMode.CLOSED
                    return true
                }
            })
        tasks.add(
            object : Task(this, R.string.maxiobset) {

                override fun isCompleted(): Boolean {
                    // val maxIOB = constraintChecker.getMaxIOBAllowed().value()
                    // return maxIOB > 0
                    return true
                }
            }.learned(Learned(R.string.objectives_maxiob_learned))
        )
    }
}