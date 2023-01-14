package com.muffakir.sawall_jawab_thequizapp

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.muffakir.sawall_jawab_thequizapp.databinding.ActivityQuizQuestionBinding

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition : Int = 1
    private var mQuestionList : ArrayList<Question>? = null
    private var mSelectedPosition : Int = 0
    private var username : String? = null
    private var mCorrectAnswer : Int = 0



    private lateinit var binding: ActivityQuizQuestionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        username = intent.getStringExtra(Constants.USERNAME)

        mQuestionList = Constants.getQuestions(this)

        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)


        setQuestion()



    }

    private fun setQuestion() {
        defaultOptionsView()

        var currentPosition = 1
        val question: Question = mQuestionList!![mCurrentPosition - 1]
        binding.ProgressBar.progress = mCurrentPosition
        binding.tvProgress.text = "$mCurrentPosition / ${binding.ProgressBar.max}"
        binding.tvQuestion.text = question.questions
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour

        if (mCurrentPosition == mQuestionList!!.size){
            binding.btnSubmit.text = "FINISH"
        }
        else {
            binding.btnSubmit.text = "NEXT"
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()

        binding.tvOptionOne.let {
            options.add(0,it)
        }
        binding.tvOptionTwo.let {
            options.add(1,it)
        }
        binding.tvOptionThree.let {
            options.add(2,it)
        }
        binding.tvOptionFour.let {
            options.add(3,it)
        }

        for (option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background =  ContextCompat.getDrawable(this,R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv : TextView, SelcectedOptionNum : Int){
        defaultOptionsView()
        mSelectedPosition = SelcectedOptionNum

        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background =  ContextCompat.getDrawable(this,R.drawable.option_selected)

    }

    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tv_option_one -> {
                binding.tvOptionOne.let {
                    selectedOptionView(it,1)
                }
            }
            R.id.tv_option_two -> {
                binding.tvOptionTwo.let {
                    selectedOptionView(it,2)
                }
            }
            R.id.tv_option_three -> {
                binding.tvOptionThree.let {
                    selectedOptionView(it,3)
                }
            }
            R.id.tv_option_four -> {
                binding.tvOptionFour.let {
                    selectedOptionView(it,4)
                }
            }
            R.id.btn_submit -> {
                if (mSelectedPosition == 0){
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                        else-> {
                            val intent = Intent(this,Result_Activity::class.java)
                            intent.putExtra(Constants.USERNAME,username)
                            intent.putExtra(Constants.CORRECT_ANSWERS,mCorrectAnswer.toString())
                            intent.putExtra(Constants.TOTAL_QUESTIONS,mQuestionList?.size.toString())
                            startActivity(intent)

                            finish()
                        }
                    }
                }else {
                    val question = mQuestionList?.get(mCurrentPosition -1)
                    if(question!!.correctAnswer != mSelectedPosition ) {
                        answerView(mSelectedPosition,R.drawable.wrong_option)
                    }else {
                        mCorrectAnswer++
                    }
                    answerView(question.correctAnswer,R.drawable.correct_option)

                    if(mCurrentPosition == mQuestionList!!.size){
                        binding.btnSubmit.text = "FINISH"
                    }
                    else {
                        binding.btnSubmit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedPosition = 0
                }

            }
        }
    }
    private fun answerView(answer : Int , drawableView : Int){
        when(answer) {
            1 -> {
                binding.tvOptionOne.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            2 -> {
                binding.tvOptionTwo.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            3 -> {
                binding.tvOptionThree.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
            4 -> {
                binding.tvOptionFour.background = ContextCompat.getDrawable(this,
                    drawableView)
            }
        }
    }
}