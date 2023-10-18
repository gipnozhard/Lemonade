Project: Lemonade App - Starter Code
==================================

Starter code for the first independent project for [Android Basics in Kotlin](https://developer.android.com/courses/android-basics-kotlin/course)

Introduction
------------

This is the starter code for the Lemonade app project in the [final pathway](https://developer.android.com/courses/pathways/android-basics-kotlin-four) of Android Basics [Unit 1](https://developer.android.com/courses/android-basics-kotlin/unit-1). This project is an opportunity for you to demonstrate the concepts you learned in the unit.

Pre-requisites
--------------

- Complete [Unit 1](https://developer.android.com/courses/android-basics-kotlin/unit-1) of Android Basics in Kotlin

Getting Started
---------------

1. Download the starter code
2. Open the project in Android Studio
3. Complete the project in accordance with the [project instructions](https://developer.android.com/codelabs/basic-android-kotlin-training-project-lemonade)

Tips
----

- Use the provided tests to ensure your app is running as expected
- DO NOT ALTER THE PROVIDED TESTS


# Проект:Приложение для приготовления лимонада

## 1. Прежде чем вы начнете

В этой лаборатории кода представлено новое приложение под названием Lemonade, которое вы создадите самостоятельно. В этой лаборатории кода вы пройдете этапы завершения проекта, включая настройку и тестирование в Android Studio.

Эта кодовая таблица отличается от других в этом курсе. В отличие от предыдущих codelabs, целью этой codelab не является предоставление пошагового руководства по созданию приложения. Вместо этого эта кодовая лаборатория предназначена для настройки проекта, который вы будете выполнять самостоятельно, предоставляя вам инструкции о том, как завершить приложение и проверить свою работу самостоятельно.

Вместо кода решения мы предоставляем набор тестов как часть приложения, которое вы скачаете. Вы запустите эти тесты в Android Studio (мы покажем вам, как это сделать позже в этой кодовой лаборатории) и посмотрите, проходит ли ваш код. Это может занять несколько попыток — даже профессиональным разработчикам редко удается пройти все тесты с первого раза! После того, как ваш код пройдет все тесты, вы можете считать этот проект завершенным.

Мы понимаем, что вы, возможно, просто хотите проверить это решение. Мы намеренно не предоставляем код решения, потому что хотим, чтобы вы на практике узнали, каково это - быть профессиональным разработчиком. Это может потребовать от вас использования различных навыков, в освоении которых у вас пока мало практики, таких как:

 * Поиск в Google терминов, сообщений об ошибках и фрагментов кода в приложении, которые вы не распознаете;

 * Тестирование кода, чтение ошибок, затем внесение изменений в код и повторное тестирование;

 * Возвращаемся к предыдущему контенту в разделе Основы Android Unit 1, чтобы обновить то, что вы узнали;

 * Сравните код, который, как вы знаете, работает (т.Е. Код, приведенный в проекте, или код предыдущего решения из других приложений в блоке 1), с кодом, который вы пишете.

На первый взгляд это может показаться сложной задачей, но мы на 100 процентов уверены, что если вы смогли завершить Блок 1, вы готовы к этому проекту. Не торопитесь и не сдавайтесь. Вы можете это сделать.

### Необходимые ингредиенты

 * Этот проект предназначен для пользователей, которые прошли первый раздел курса "Основы Android в Kotlin".

### Что вы будете готовить
 * Вы создадите простое приложение для приготовления лимонада, используя навыки, которые вы изучили в разделе 1.

### Что вам понадобится

* Компьютер с установленной Android Studio.

## 2. Обзор приложения

Добро пожаловать в проект: Приложение для приготовления лимонада!

Мы приняли вас в нашу команду, чтобы вы помогли нам воплотить в жизнь наше видение создания цифрового лимонада. Цель - создать простое интерактивное мобильное приложение, которое позволит вам выжимать сок из лимонов до тех пор, пока у вас не останется стакан лимонада. Считайте это метафорой или, может быть, просто забавным способом скоротать время!

Готовое приложение Lemonade будет состоять из одного экрана. При первом запуске приложения пользователям предлагается выбрать лимон, нажав на изображение лимонного дерева.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/74564d5b-763e-4eef-86f4-5059cdd02525)

При нажатии на лимонное дерево пользователь получает лимон, который он может "выжать" неопределенное количество раз (точное количество необходимых выжиманий генерируется случайным образом), прежде чем перейти к следующему экрану.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/96f0e31f-8ba9-45ca-9c26-e2d9214f4df6)

Как только пользователь нажмет, чтобы выжать лимон нужное количество раз, он увидит изображение стакана для "питья" лимонада.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/a4c24fcd-f730-4151-96db-59dab5f730b5)

После нажатия кнопки выпить лимонад стакан становится пустым, и пользователь может снова нажать на изображение, чтобы вернуться к первому экрану, и выбрать другой лимон с дерева.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/342b2562-70f8-43c7-841e-49adbda2e250)

Приложение построено на простоте и организовано в виде единого действия. Различные состояния приложения (выбирает ли пользователь лимон, выжимает лимон, пьет лимонад и, наконец, пустой стакан) представлены чем-то, называемым конечным автоматом. Это звучит как причудливый теоретический термин, но все это означает, что состояние приложения (т. Е. Какой текст и изображение отображаются пользователю) определяется переменной, которая содержит состояние приложения (select, squeeze и т.д.). Состояние приложения обновляется вместе с любыми другими необходимыми переменными, а затем пользовательский интерфейс настраивается (задаются изображение и текст) отдельно, как только все обновления будут сделаны.

Все переменные для состояния приложения были определены для вас. Ваша задача - создать макет приложения и реализовать логику таким образом, чтобы пользовательский интерфейс переходил из одного состояния в другое, как ожидалось.

### Тестирование вашего кода

Для приложения Lemonade (и будущих проектов) вам будет предоставлено несколько автоматических тестов, с помощью которых вы сможете убедиться, что ваш код работает должным образом.

Что такое автоматизированные тесты? При разработке программного обеспечения вы можете думать о "тестировании" как о коде, который проверяет, работает ли другой код. Это делается путем проверки выходных данных (таких как содержимое элементов пользовательского интерфейса на экране), чтобы увидеть, имеют ли они смысл на основе входных данных, известных как "тестовые примеры". Начальный проект для приложения Lemonade включает в себя несколько тестов, которые вы сможете выполнить, чтобы убедиться в правильности реализации логики. Мы обсудим тесты более подробно позже. А пока пришло время загрузить стартовый код и приступить к созданию приложения Lemonade.

## 3. Начало работы

### Загрузить код проекта

Обратите внимание, что имя папки - android-basics-kotlin-lemonade-app. Выберите эту папку при открытии проекта в Android Studio.

--------------------------------------------------------------

URL-адрес кода закуски:
https://github.com/google-developer-training/android-basics-kotlin-lemonade-app
Название филиала с кодом стартера: main

---------------------------------------------------------------

Чтобы получить код для этой кодовой лаборатории и открыть его в Android Studio, выполните следующие действия.

###Получить код

 1. Нажмите на указанный URL-адрес. Откроется страница проекта на GitHub в браузере.

 2. Проверьте и убедитесь, что название филиала совпадает с названием филиала, указанным в codelab. Например, на следующем скриншоте название филиала - main.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/01727bc5-0f79-4098-838b-f1ff0ee18cfb)

 3. На странице проекта в GitHub нажмите кнопку Code, которая вызовет всплывающее окно.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/0bc93529-ef63-483d-aecb-6dcf079daa51)

 4. Во всплывающем окне нажмите кнопку Загрузить ZIP, чтобы сохранить проект на свой компьютер. Дождитесь завершения загрузки.

 5. Найдите файл на своем компьютере (вероятно, в папке "Загрузки").

 6. Дважды щелкните ZIP-файл, чтобы распаковать его. При этом будет создана новая папка, содержащая файлы проекта.

### Откройте проект в Android Studio

 1. Запустите Android Studio.

 2. В окне Добро пожаловать в Android Studio нажмите Открыть.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/593e997d-a288-4cbd-b24f-ee2d263e67ca)

Примечание: Если Android Studio уже открыта, вместо этого выберите пункт меню "Файл" > "Открыть".

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/77e32a36-6e0e-435b-9492-5b91d085e44e)

 3. В файл-браузере перейдите к распакованной папке проекта находится (скорее всего, в вашем загрузки папки).
 
 4. Дважды щелкните по этой папке проекта.

 5. Подождите, пока Android Studio откроет проект.

 6. Нажмите кнопку "Выполнить8de56cba7583251f.png", чтобы создать и запустить приложение. Убедитесь, что оно построено должным образом.

Найдите минутку, чтобы ознакомиться с проектом starter. Обратите особое внимание на MainActivity.kt файл.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/24430393-503a-4500-85ba-6e6852278151)

В MainActivity.kt вы найдете несколько переменных, используемых для представления текущего состояния приложения. Вы будете использовать их на более позднем этапе, чтобы сделать приложение интерактивным. Хотя объем приведенного здесь кода может показаться непомерным, вам не нужно будет изменять какой-либо код, который не помечен TODO. Конкретные инструкции приведены на следующих страницах.

Вы также заметите, что проект также включает в себя другой пакет, com.example.lemonade (androidTest).

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/6cb0e631-a742-4073-a6b9-a342ba3992d3)

Сюда входят автоматизированные тесты, которые вы будете использовать для проверки правильности функциональности, реализованной в MainActivity.kt. Опять же, подробнее об этом позже. На данный момент вы готовы приступить к созданию своего приложения, начиная с пользовательского интерфейса.

## 4. Создайте свой пользовательский интерфейс

Для приложения Lemonade требуется только базовый макет; вам нужны только два вида для реализации всей его функциональности.

 1. TextView Который содержит инструкции для пользователя.

 2. ImageView Который показывает графику, основанную на текущем состоянии приложения (например, лимон, который нужно выжать).

Вы создадите этот макет в activity_main.xml.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/d41411da-4c6b-4ce0-afc8-f9a73a934eca)

Используя ваши знания редактора макетов, ваша цель - создать макет, который выглядит примерно так, как показано ниже, с обоими видами по центру экрана и TextView над ImageView.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/f746dbac-ea9d-4a46-838e-b99a949bf400)

----------------------------------------------------------------

Совет: Вы уже использовали ConstraintLayout при работе с редактором макетов Android Studio. Макеты ограничений хорошо подходят для создания макетов со сложенными представлениями, например, в приложении Lemonade. Если вам нужно обновить информацию по ConstraintLayout, обратитесь к кодовой лаборатории "Создание приложения для поздравительных открыток".

----------------------------------------------------------------

## 5. Сделайте свое приложение интерактивным

Как только ваш макет будет завершен, откройте его MainActivity.kt. Здесь вы реализуете всю логику приложения. Вы заметите, что там уже довольно много кода. Также отмечено много комментариев // TODO: (пример ниже). Это задания, которые вы должны выполнить.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/871cc372-b503-4c40-b6a1-a42d30dff882)

Есть три основные вещи, которые вам нужно реализовать, чтобы заставить приложение lemonade работать.

 1. Настройте lemonImage ImageView так, чтобы он реагировал на вводимые пользователем данные.

 2. Реализовать clickLemonImage() для обновления состояния приложения.

 3. Реализовать setViewElements() обновление пользовательского интерфейса в зависимости от текущего состояния приложения.

Давайте рассмотрим каждое задание по очереди.

### Шаг 1: Настройте вид изображения

Нажатие на изображение должно перевести приложение из одного состояния в другое. В конце onCreate() обратите внимание, что необходимо настроить два прослушивателя.

 1. setOnClickListener() следует обновить состояние приложения. Способ сделать это clickLemonImage().

 2. setOnLongClickListener() реагирует на события, когда пользователь долго нажимает на изображение (например, пользователь нажимает на изображение и не сразу отпускает палец). Для длительных пресс-релизов в нижней части экрана появляется виджет, называемый snackbar, позволяющий пользователю узнать, сколько раз он выжимал лимон. Это делается с помощью showSnackbar() метода.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/52a6dd8c-2d7c-45e3-9085-5c12b24a25b6)

--------------------------------------------------------------

Примечание: Важно, чтобы вы НЕ меняли название ни одного из существующих методов. В противном случае тесты могут быть не в состоянии выполняться.

--------------------------------------------------------------

На следующем шаге вы реализуете логику изменения состояния приложения.

### Шаг 2: Реализовать функцию clickLemonImage()

После завершения предыдущего шага clickLemonImage() метод теперь вызывается каждый раз, когда пользователь нажимает на изображение. Этот метод отвечает за перевод приложения из текущего состояния в следующее и обновление любых переменных по мере необходимости. Существует четыре возможных состояния: SELECT, SQUEEZE, DRINK и, RESTART; текущее состояние представлено lemonadeState переменной. Этот метод должен делать что-то свое для каждого штата.

 1. SELECT: Переходя в SQUEEZE состояние, установите lemonSize (необходимое количество выжиманий), вызвав pick() метод, и установите squeezeCount (количество раз, когда пользователь выжимал лимон) равным 0.

 2. SQUEEZE: Увеличьте squeezeCount на 1 и уменьшите lemonSize на 1. Помните, что для того, чтобы приложение смогло перевести лимон в другое состояние, потребуется разное количество выжиманий. Переходите в DRINK состояние только в том случае, если значение new lemonSize равно 0. В противном случае приложение должно оставаться в SQUEEZE состоянии.

 3. DRINK: Перейдите в RESTART состояние и установите lemonSize значение -1.

 4. RESTART: Переход обратно в SELECT состояние.

После того, как вы обработаете все обновления и переходы между состояниями, обязательно вызовите setViewElements(), чтобы обновить пользовательский интерфейс на основе нового состояния.

---------------------------------------------------------------

Совет: Оператор when - отличный способ проверить несколько возможных условий одного значения, таких как lemonadeState.

---------------------------------------------------------------

### Шаг 3: Реализация setViewElements()

setViewElements() Метод отвечает за обновление пользовательского интерфейса в зависимости от состояния приложения. Текст и изображение должны быть обновлены на значения, указанные ниже, чтобы соответствовать lemonadeState.

SELECT:

 * Текст: Нажмите, чтобы выбрать лимон!
 
 * Изображение: R.drawable.lemon_tree

SQUEEZE:

 * Текст: Нажмите, чтобы выжать сок из лимона!
 
 * Изображение: R.drawable.lemon_squeeze

DRINK:

 * Текст: Нажмите, чтобы выпить свой лимонад!

 * Изображение: R.drawable.lemon_drink

RESTART:

 * Текст: Нажмите, чтобы начать снова!

 * Изображение: R.drawable.lemon_restart

-------------------------------------------------------------

Совет: В стартовом коде уже есть переменная для lemonImage, когда вы устанавливаете прослушиватели в onCreate().

-------------------------------------------------------------

-------------------------------------------------------------

Дополнительная заслуга: Вместо жесткого кодирования строк в вашем коде Kotlin подумайте о том, чтобы сделать эти значения строковыми ресурсами в strings.xml.

--------------------------------------------------------------

### Как использовать строковые ресурсы

В Android почти все является ресурсом. Определение ресурсов, к которым вы затем можете получить доступ в своем приложении, является неотъемлемой частью разработки для Android.

Ресурсы используются для чего угодно, начиная от определения цветов, изображений, макетов, меню и строковых значений. Преимущество этого в том, что ничто не закодировано жестко. Все определено в этих файлах ресурсов, а затем на них можно ссылаться в коде вашего приложения. Самым простым из этих ресурсов (и наиболее распространенным) является использование строковых ресурсов для обеспечения гибкого локализованного текста.

Строки или статический текст могут храниться в отдельном файле под названием strings.xml во вложенной папке values папки res.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/db8df067-7c85-4972-b353-b34b4f2b4876)

Для каждого фрагмента текста, который вы хотите отобразить в своем приложении (например, надпись кнопки или текст внутри TextView), вы должны сначала определить текст в res/values/strings.xml файле. Каждая запись представляет собой ключ (представляющий идентификатор текста) и значение (сам текст). Например, если вы хотите, чтобы кнопка отображала "Отправить", добавьте следующий строковый ресурс в res/values/strings.xml:

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/e9389c1c-57a3-43eb-9d53-054743f622f3)

Чтобы получить доступ к ресурсу непосредственно в вашем коде, просто используйте методы getResources.getString() или getString() для доступа к значению, заданному идентификатором ресурса, R.string.submit_label.:

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/9a171117-4637-4084-ae2c-a1d0f96b0b33)

Чтобы напрямую установить текст из строкового ресурса в TextView, вы можете вызвать setText() для объекта TextView и передать идентификатор ресурса.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/33c3de71-8778-4b30-87b9-98194d52f178)

Строковые ресурсы также могут содержать специальные символы для форматирования текста. Например, у вас может быть строковый ресурс, который позволяет вставить в строку другой фрагмент текста.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/788b419c-0f49-46c9-a444-678eb79a5057)

В коде вы могли бы получить доступ к строковому ресурсу и отформатировать его, передав аргументы.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/7602ed48-f197-4d23-957b-940f98005673)

При объявлении строкового ресурса каждый аргумент нумеруется в порядке его появления (1, 2 и т.д.) И имеет букву для обозначения типа (d для десятичного числа, s для строки и т.д.). Аргументы правильного типа могут быть переданы в вызов getString().

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/b072a6fd-ba24-4094-ab37-00f9f2a426e7)

Чтобы узнать больше, обратитесь к документации по строковым ресурсам.

---------------------------------------------------------------

Примечание: Вы можете увидеть пример строковых ресурсов, использующих аргументы в приложении Lemonade с squeeze_count ресурсом, доступ к которому осуществляется showSnackbar() методом в MainActivity.

---------------------------------------------------------------

## 6. Запустите свое приложение

После того, как вы создали пользовательский интерфейс приложения и внедрили основное действие, пришло время увидеть свою тяжелую работу в действии. Запустите приложение с помощью меню "Выполнить" > "Запустить приложение", и эмулятор запустится.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/03a8e80c-29cb-430c-b21c-8c8ec5f9f487)

Теперь приложение должно быть полностью интерактивным, и вы должны иметь возможность нажимать на изображение для перехода из одного состояния в другое.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/93048b57-769c-469a-804d-83bcc35e1d0d)

Пока лимон отображается на экране, вы также можете попробовать длительное нажатие (нажать и удерживать) ImageView, чтобы увидеть панель закусок внизу, показывающую общее количество раз, когда лимон был выжат. Потратьте некоторое время на то, чтобы несколько раз просмотреть приложение по всем штатам. Затем найдите минутку, чтобы поздравить себя с проделанной работой!

----------------------------------------------------------------

Совет: Если у вас нет виртуальных устройств, вы можете создать их, следуя этим инструкциям в разделе Создание и запуск вашего первого приложения для Android.

----------------------------------------------------------------

## 7. Инструкции по тестированию

### Протестируйте свое приложение

Вы закончили реализацию приложения Lemonade, но при профессиональной разработке программного обеспечения простое написание кода редко бывает последним шагом. В дополнение к коду приложения, приложения профессионального качества также включают тестовый код, который запускается для проверки того, что код работает должным образом и что изменения в коде не вносят никаких новых ошибок, - процесс, называемый автоматическим тестированием. Хотя обучение автоматизированному тестированию выходит за рамки данного проекта, приложение Lemonade поставляется в комплекте с некоторыми тестами, которые помогут вам убедиться в правильности реализации проекта. Вы можете использовать это как форму самооценки, чтобы увидеть, выполнили ли вы все требования проекта и нужны ли какие-либо изменения в вашем приложении.

Что именно представляет собой "тест"? Тесты - это просто фрагменты кода, включенные в ваш проект Android Studio, которые запускают часть кода вашего приложения и могут либо "пройти", либо "потерпеть неудачу" в зависимости от того, работает ли код вашего приложения так, как ожидалось.

-----------------------------------------------------------------

Совет: Обычно сообщения о сбое теста будут специфичны для тестовой функции. В приведенном ниже примере неудачный тест проверяет содержимое текстового представления. Однако, если вы когда-нибудь не будете уверены в том, что означает сообщение о сбое теста, вы всегда можете вставить часть ошибки в Google. Скорее всего, кто-то уже задавал этот вопрос раньше!

-----------------------------------------------------------------

Итак, где вы находите и запускаете тесты своего приложения? Тесты для приложения Lemonade находятся в цели тестирования. Target - это просто термин для разработки программного обеспечения, обозначающий набор классов, которые объединены вместе. Например, приложение Lemonade существует в целевом объекте с именем "app", в то время как тесты существуют в целевом объекте с именем "LemonadeTests". Хотя цель LemonadeTests может получать доступ к коду из целевого приложения, они полностью разделены, и код приложения не содержит никакого кода тестирования.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/92f804ce-653d-4d9a-bfdc-10f8106ff8eb)

При просмотре файлов в режиме "Android" целевой объект тестирования будет отображаться с тем же именем пакета, что и у приложения, но с (androidTest) в круглых скобках.

Есть также несколько ключевых терминов, которые следует знать при обращении к тестируемому коду.

 * Набор тестов - целевой объект, включающий все ваши тестовые случаи.

 * Тестовый пример - класс, состоящий из отдельных тестов для соответствующей функциональности (в приложении Lemonade был только один тестовый пример, но в более крупных приложениях их часто гораздо больше).

 * Тест - функция, которая проверяет одну конкретную вещь.

Тестовый пример может содержать несколько тестов, а набор тестов вашего проекта может содержать несколько тестовых примеров.

### Запускаем ваши тесты

Чтобы запустить свои тесты, вы можете выполнить одно из следующих действий.

Для создания отдельного тестового примера откройте класс тестового примера и щелкните зеленую стрелку слева от объявления класса. Затем вы можете выбрать опцию Выполнить в меню. При этом будут запущены все тесты в тестовом примере.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/ac7453bd-98c9-4812-9de4-f36f29108e5c)

Часто вам захочется запустить только один тест, например, если есть только один неудачный тест, а остальные тесты пройдены успешно. Вы можете запустить один тест так же, как и весь тестовый набор. Использовать зеленую стрелку и выберите запустить опцию.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/5e6cd840-2d40-4644-a885-5d72d161b32a)

Если у вас есть несколько тестовых примеров, вы также можете запустить весь набор тестов. Как и при запуске приложения, вы можете найти эту опцию в меню Выполнить.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/1fba3e8a-8efe-4f1a-a768-1a4d9b8eecf2)

Обратите внимание, что Android Studio по умолчанию использует последнюю цель, которую вы запускали (приложение, тестовые цели и т.д.), Поэтому, если в меню по-прежнему указано Выполнить> Запустить "приложение", вы можете запустить тестовую цель, выбрав Выполнить> Выполнить.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/e8ab53dc-9161-41c7-a871-312f0d366504)

Затем выберите тестовую цель во всплывающем меню.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/d71b0e85-3fb2-4d5f-aa6e-135783ed20ee)

Результаты выполнения тестов показаны на вкладке Выполнить. На панели слева вы увидите список неудачных тестов, если таковые имеются. Неудачные тесты отмечены красным восклицательным знаком рядом с названием функции. Успешные тесты отмечены зеленой галочкой.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/025fb2dc-83d5-43a0-8689-5b8849033691)

---------------------------------------------------------------

Совет: Чтобы отобразить пройденный, неуспевающий или оба теста - "Пройденный" и "неуспевающий" - на левой панели, вы можете использовать две кнопки в левом верхнем углу. При установке флажка будет показано прохождение тестов, при выборе значка в виде круга с линией, проходящей через него, будет указан список неудачных тестов. По умолчанию отображаются только неудачные тесты.

---------------------------------------------------------------

В случае сбоя теста текстовый вывод предоставляет информацию, которая поможет вам устранить проблему, вызвавшую сбой теста.

![image](https://github.com/gipnozhard/Lemonade/assets/71705375/ce27dff3-2286-4c08-8cfe-cbbd27aead38)

Например, в приведенном выше сообщении об ошибке тест проверяет, использует ли a TextView определенный строковый ресурс. Однако тест завершается ошибкой. Текст после "Ожидалось" и "Получено" не совпадает, что означает, что ожидаемое тестом значение не соответствует значению из запущенного приложения. В этом примере строка, используемая в TextView, на самом деле не является squeeze_count, как ожидает тест.

## 8. Необязательно: Поделитесь своим приложением!

После того, как вы выпьете много бокалов лимонада, сделайте скриншот своего любимого экрана и поделитесь им в Twitter, чтобы продемонстрировать, чему вы научились. Отметьте @AndroidDev и добавьте хэштег #AndroidBasics.









