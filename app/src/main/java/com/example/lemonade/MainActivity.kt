/*
 * Copyright (C) 2021 The Android Open Source Project.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.lemonade

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    /**
     * DO NOT ALTER ANY VARIABLE OR VALUE NAMES OR THEIR INITIAL VALUES.
     *
     * Anything labeled var instead of val is expected to be changed in the functions but DO NOT
     * alter their initial values declared here, this could cause the app to not function properly.
     */
    private val LEMONADE_STATE = "LEMONADE_STATE"
    private val LEMON_SIZE = "LEMON_SIZE"
    private val SQUEEZE_COUNT = "SQUEEZE_COUNT"
    // SELECT represents the "pick lemon" state
    private val SELECT = "select"
    // SQUEEZE represents the "squeeze lemon" state
    private val SQUEEZE = "squeeze"
    // DRINK represents the "drink lemonade" state
    private val DRINK = "drink"
    // RESTART represents the state where the lemonade has been drunk and the glass is empty
    private val RESTART = "restart"
    // Default the state to select
    private var lemonadeState = "select"
    // Default lemonSize to -1
    private var lemonSize = -1
    // Default the squeezeCount to -1
    private var squeezeCount = -1

    private var lemonTree = LemonTree()
    private var lemonImage: ImageView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // === DO NOT ALTER THE CODE IN THE FOLLOWING IF STATEMENT ===
        if (savedInstanceState != null) {
            lemonadeState = savedInstanceState.getString(LEMONADE_STATE, "select")
            lemonSize = savedInstanceState.getInt(LEMON_SIZE, -1)
            squeezeCount = savedInstanceState.getInt(SQUEEZE_COUNT, -1)
        }
        // === END IF STATEMENT ===

        lemonImage = findViewById(R.id.image_lemon_state)
        setViewElements()
        lemonImage!!.setOnClickListener {
            // TODO: call the method that handles the state when the image is clicked
            clickLemonImage()
        }
        lemonImage!!.setOnLongClickListener {
            // TODO: replace 'false' with a call to the function that shows the squeeze count
            showSnackbar()
            false
        }
    }

    /**
     * === DO NOT ALTER THIS METHOD ===
     *
     * This method saves the state of the app if it is put in the background.
     */
    override fun onSaveInstanceState(outState: Bundle) {
        outState.putString(LEMONADE_STATE, lemonadeState)
        outState.putInt(LEMON_SIZE, lemonSize)
        outState.putInt(SQUEEZE_COUNT, squeezeCount)
        super.onSaveInstanceState(outState)
    }

    /**
     * Clicking will elicit a different response depending on the state.
     * This method determines the state and proceeds with the correct action.
     */

    //Method that will be called when user click on the image
    //Метод, который будет вызван, когда пользователь нажмет на изображение
    private fun clickLemonImage() {
        // TODO: use a conditional statement like 'if' or 'when' to track the lemonadeState
        //  when the image is clicked we may need to change state to the next step in the
        //  lemonade making progression (or at least make some changes to the current state in the
        //  case of squeezing the lemon). That should be done in this conditional statement

        // TODO: When the image is clicked in the SELECT state, the state should become SQUEEZE
        //  - The lemonSize variable needs to be set using the 'pick()' method in the LemonTree class
        //  - The squeezeCount should be 0 since we haven't squeezed any lemons just yet.

        // TODO: When the image is clicked in the SQUEEZE state the squeezeCount needs to be
        //  INCREASED by 1 and lemonSize needs to be DECREASED by 1.
        //  - If the lemonSize has reached 0, it has been juiced and the state should become DRINK
        //  - Additionally, lemonSize is no longer relevant and should be set to -1

        // TODO: When the image is clicked in the DRINK state the state should become RESTART

        // TODO: When the image is clicked in the RESTART state the state should become SELECT

        // TODO: lastly, before the function terminates we need to set the view elements so that the
        //  UI can reflect the correct state

        //-------------------------------------------------------------

        //TODO: используйте условный оператор типа "if" или "when" для отслеживания состояния lemonadeState
        // при нажатии на изображение нам, возможно, потребуется перейти к следующему шагу в
        // процессе приготовления лимонада (или, по крайней мере, внести некоторые изменения в текущее состояние в
        // случае выжимания лимона). Это должно быть сделано в этом условном операторе

        // TODO: При щелчке по изображению в состоянии SELECT состояние должно стать SQUEEZE
        //  - Переменная lemonSize должна быть установлена с помощью метода 'pick()' в классе LemonTree
        //  - Значение squeezeCount должно быть равно 0, так как мы еще не выжали ни одного лимона.

        // TODO: При нажатии на изображение в состоянии SQUEEZE количество сжатий должно быть
        //  УВЕЛИЧЕНО на 1, а размер лимона должен быть УМЕНЬШЕН на 1.
        //  - Если размер лимона достиг 0, значит, из него выжали сок и он должен стать НАПИТКОМ
        //  - Кроме того, размер лимона больше не имеет значения и должен быть установлен в -1

        // TODO: При нажатии на изображение в состоянии НАПИТКА состояние должно стать ПЕРЕЗАПУСКАЕМЫМ

        // TODO: При нажатии на изображение в состоянии перезапуска состояние должно стать SELECT

        // TODO: наконец, перед завершением работы функции нам нужно настроить элементы представления так, чтобы
        //  пользовательский интерфей//Method that will be called when user click on the image
        //        //Метод, который будет вызван, когда пользователь нажмет на изображениес мог отражать правильное состояние



        //based on current lemonadeState the data would be changed
        //на основе текущего состояния lemonadeState данные будут изменены
        when(lemonadeState) {

            SELECT -> {
                //if the state is SELECT that means on tap we will try to squeeze the lemon so set the state as SQUEEZE
                //если состояние SELECT, это означает, что при нажатии мы попытаемся выжать лимон, поэтому установите состояние как SQUEEZE
                lemonadeState = SQUEEZE
                //determining the size of tree by peek() function
                //determining the size of tree by peek() function
                val tree: LemonTree = lemonTree
                lemonSize = tree.pick()
                //in starting there is no squeeze so count=0, 0, after the count will be increased by 1
                //при запуске сжатия нет, поэтому count=0, 0, после этого количество будет увеличено на 1
                squeezeCount = 0
            }

            SQUEEZE -> {
                //now we are squeezing so count will be increased by 1 and size will be decreased by 1
                //теперь мы сжимаем, так что количество будет увеличено на 1, а размер уменьшен на 1
                squeezeCount += 1
                lemonSize -= 1
                //now the lemonadeState will in Squeeze state until we do not complete the whole lemon(lemonSize=0)
                //so if the lemonSize is 0, then the state will be DRINK till then we have to Squeeze

                //теперь lemonadeState будет находиться в состоянии SQUEEZE до тех пор, пока мы не съедим весь лимон целиком(lemonSize=0)
                //итак, если размер лимона равен 0, то состояние будет DRINK, до тех пор, пока нам не придется выжимать сок.
                lemonadeState = if (lemonSize == 0) {
                    DRINK
                } else {
                    SQUEEZE
                }
            }

            //if state is Drink then we will just drink the lemonade and state will be restart
            //если состояние Drink, то мы просто выпьем лимонад, и состояние будет перезапущено
            DRINK -> {
                lemonadeState = RESTART
                lemonSize = -1
            }

            //restart means now we will have to select the lemon form the tree
            //перезапуск означает, что теперь нам нужно будет выбрать лимон из дерева
            RESTART -> {
                lemonadeState = SELECT
            }
        }
        //as per result of the above we will call the setViewElements() function and set the view accordingly
        //в соответствии с результатом вышеизложенного мы вызовем функцию setViewElements() и соответствующим образом настроим представление
        setViewElements()
    }

    /**
     * Set up the view elements according to the state.
     */
    private fun setViewElements() {
        val textAction: TextView = findViewById(R.id.text_action)
        val lemonImage: ImageView = findViewById(R.id.image_lemon_state)

        // TODO: set up a conditional that tracks the lemonadeState

        // TODO: for each state, the textAction TextView should be set to the corresponding string from
        //  the string resources file. The strings are named to match the state

        // TODO: Additionally, for each state, the lemonImage should be set to the corresponding
        //  drawable from the drawable resources. The drawables have the same names as the strings
        //  but remember that they are drawables, not strings.

        //-------------------------------------------------------------

        // TODO: настройте условие, которое отслеживает состояние lemonadeState

        // TODO: для каждого состояния textAction TextView должно быть установлено значение соответствующей строки из
        //  файл string resources. Строки именуются в соответствии с состоянием

        // TODO: Кроме того, для каждого состояния lemonImage должно быть установлено соответствующее значение
        //  извлекаемый из доступных ресурсов. Объекты рисования имеют те же имена, что и строки
        //  но помните, что это объекты для рисования, а не строки.

        //What ever the state is, we have to set properties of image and text as follow
        //Каким бы ни было состояние, мы должны установить свойства изображения и текста следующим образом
        when (lemonadeState) {
            SELECT -> {
                textAction.text = getString(R.string.lemon_select)
                lemonImage.setImageResource(R.drawable.lemon_tree)
            }
            SQUEEZE -> {
                textAction.text = getString(R.string.lemon_squeeze)
                lemonImage.setImageResource(R.drawable.lemon_squeeze)
            }
            DRINK -> {
                textAction.text = getString(R.string.lemon_drink)
                lemonImage.setImageResource(R.drawable.lemon_drink)
            }
            RESTART -> {
                textAction.text = getString(R.string.lemon_empty_glass)
                lemonImage.setImageResource(R.drawable.lemon_restart)
            }
        }

    }

    /**
     * === DO NOT ALTER THIS METHOD ===
     *
     * Long clicking the lemon image will show how many times the lemon has been squeezed.
     */
    private fun showSnackbar(): Boolean {
        //this will be active only when the state in SQUEEZE , return false otherwise
        //это будет активно только тогда, когда состояние в SQUEEZE , в противном случае вернет значение false
        if (lemonadeState != SQUEEZE) {
            return false
        }
        val squeezeText = getString(R.string.squeeze_count, squeezeCount)
        Snackbar.make(
            findViewById(R.id.constraint_Layout),
            squeezeText,
            Snackbar.LENGTH_SHORT
        ).show()
        return true
    }
}

/**
 * A Lemon tree class with a method to "pick" a lemon. The "size" of the lemon is randomized
 * and determines how many times a lemon needs to be squeezed before you get lemonade.
 */
class LemonTree {
    fun pick(): Int {
        return (2..4).random()
    }
}
