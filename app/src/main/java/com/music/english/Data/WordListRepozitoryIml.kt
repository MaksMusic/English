package com.music.english.Data

import com.music.english.domain.RepositoryWord
import com.music.english.domain.Word

object WordListRepozitoryIml : RepositoryWord {
    var listWord = ArrayList<Word>()

    init {
        var s = listOf<String>(
            "and,и",
            "or,или:",
            "from, из:",
            "start, начало:",
            "end,конец:",
            "button,кнопка",
            "edit,редактировать",
            "lenght,длина",
            "weight,масса",
            "text, текст",
            "image, изображение",
            "close,закрыть",
            "year, год (еар)",
            "setting,параметр",
            "swap,менять",
            "clone,клон",
            "eqalse, равный",
            "finish,финиш",
            "speek,говорить (спик)",
            "skip,пропускать",
            "browser,браузер",
            "phone,телефон",
            "projects,проект",
            "account,аккаунт",
            "profile,профиль",
            "packege , пакет",
            "packeges, пакеты",
            "company, компания",
            "location,расположение",
            "update,обновить",
            "look, смотреть ",
            "developer,разработчик",
            "user,пользователь ",
            "book,книга  ",
            "followers,последователи",
            "bubl, пузырь",
            "jump,прыжок",
            "step,шаг (степ)",
            "weater ,погода",
            "monday,понидельник",
            "tuesday ,вторник",
            "green , зеленый",
            "red,красный",
            "yellow,желтый",
            "black,черный",
            "blu , синий",
            "brown, коричневый",
            "result, результат",
            "answers,ответы",
            "question, вопрос"
        )

        for (i in 0..s.size - 1) {
            listWord.add(
                Word(
                    s.get(i).substringBeforeLast(","),
                    s.get(i).substringAfter(",")
                )
            )
        }

    }

    override fun addWord(word: Word) {
        listWord.add(word)
    }

    override fun deleteWord(word: Word) {
        listWord.remove(word)
    }

    override fun editdWord(word: Word) {
        for (word in listWord) {
            if (word.wordEn == word.wordEn) {
                word.wordRu = word.wordRu
            }
        }
    }


}