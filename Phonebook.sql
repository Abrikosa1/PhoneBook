-- phpMyAdmin SQL Dump
-- version 4.8.0-dev
-- https://www.phpmyadmin.net/
--
-- Хост: 192.168.30.23
-- Время создания: Окт 23 2017 г., 15:51
-- Версия сервера: 8.0.2-dmr
-- Версия PHP: 7.0.19-1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `Phonebook`
--

-- --------------------------------------------------------

--
-- Структура таблицы `Abonents`
--

CREATE TABLE `Abonents` (
  `id` int(2) NOT NULL COMMENT 'ид абонента',
  `first_name` varchar(50) NOT NULL DEFAULT 'no' COMMENT 'имя абонента',
  `middle_name` varchar(50) NOT NULL DEFAULT 'no' COMMENT 'отчество абонента',
  `last_name` varchar(50) NOT NULL DEFAULT 'no' COMMENT 'фамилия абонента'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `Abonents`
--

INSERT INTO `Abonents` (`id`, `first_name`, `middle_name`, `last_name`) VALUES
(1, 'Антон', 'Юрьевич', 'Юрков'),
(2, 'Антон', 'Иванович', 'Авдеев'),
(3, 'Денис', 'Игоревич', 'Иванов'),
(4, 'Евгений', 'Евгеньевич', 'Фялковский');

-- --------------------------------------------------------

--
-- Структура таблицы `Admin`
--

CREATE TABLE `Admin` (
  `id` int(2) NOT NULL COMMENT 'ид админа',
  `login` varchar(50) NOT NULL DEFAULT 'no' COMMENT 'логин админа',
  `password` varchar(50) NOT NULL DEFAULT 'no' COMMENT 'пароль админа'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `Admin`
--

INSERT INTO `Admin` (`id`, `login`, `password`) VALUES
(1, 'admin1', '12345'),
(2, 'admin2', '12345'),
(3, 'admin3', '12345'),
(4, 'admin5', '12345'),
(5, 'admin5', '12345');

-- --------------------------------------------------------

--
-- Структура таблицы `Phone_Numbers`
--

CREATE TABLE `Phone_Numbers` (
  `id` int(6) NOT NULL COMMENT 'ид номера',
  `abonent_id` int(6) NOT NULL COMMENT 'ид абонента',
  `phone_num` varchar(20) NOT NULL DEFAULT 'no' COMMENT 'номер телефона'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Дамп данных таблицы `Phone_Numbers`
--

INSERT INTO `Phone_Numbers` (`id`, `abonent_id`, `phone_num`) VALUES
(1, 1, '8-888-888-88-88'),
(2, 3, '8-999-999-99-99'),
(3, 2, '8-333-333-33-33'),
(4, 4, '8-444-444-44-44');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `Abonents`
--
ALTER TABLE `Abonents`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `Phone_Numbers`
--
ALTER TABLE `Phone_Numbers`
  ADD PRIMARY KEY (`id`),
  ADD KEY `abonent_id` (`abonent_id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `Abonents`
--
ALTER TABLE `Abonents`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT COMMENT 'ид абонента', AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT для таблицы `Admin`
--
ALTER TABLE `Admin`
  MODIFY `id` int(2) NOT NULL AUTO_INCREMENT COMMENT 'ид админа', AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT для таблицы `Phone_Numbers`
--
ALTER TABLE `Phone_Numbers`
  MODIFY `id` int(6) NOT NULL AUTO_INCREMENT COMMENT 'ид номера', AUTO_INCREMENT=5;

--
-- Ограничения внешнего ключа сохраненных таблиц
--

--
-- Ограничения внешнего ключа таблицы `Phone_Numbers`
--
ALTER TABLE `Phone_Numbers`
  ADD CONSTRAINT `Phone_Numbers_ibfk_1` FOREIGN KEY (`abonent_id`) REFERENCES `Abonents` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
