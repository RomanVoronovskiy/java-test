# Конфиги для тестирования: 

## консоль + файл

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns="https://logging.apache.org/xml/ns"
               xsi:schemaLocation="
                       https://logging.apache.org/xml/ns
                       https://logging.apache.org/xml/ns/log4j-config-2.xsd">

    <!-- Логи выводятся в консоль и файл -->

    <Appenders>
        <!-- Консольный аппендер: выводит логи в стандартный вывод (консоль).
             Используется имя "Console" и вывод идет в SYSTEM_OUT (по умолчанию это консоль приложения). -->
        <Console name="Console" target="SYSTEM_OUT">
            <!-- Определение шаблона для вывода лога в консоль.
                 %d - дата, %-5p - уровень логирования, %c{1} - имя класса, %L - номер строки, %m - сообщение, %n - новая строка -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>

        <!-- Файловый аппендер: выводит логи в файл "logs/app.log".
             append="true" означает, что логи будут добавляться в конец файла, а не перезаписываться. -->
        <File name="FileLogger" fileName="logs/app.log" append="true">
            <!-- Определение шаблона для вывода лога в файл. Шаблон аналогичен консольному. -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </File>
    </Appenders>

    <Loggers>
        <!-- Корневой логгер: применяется по умолчанию ко всем классам.
             Уровень логирования "INFO" означает, что сообщения уровня INFO и выше (WARN, ERROR) будут выводиться.
             AppenderRef ref="Console" и AppenderRef ref="FileLogger" указывают, что логи будут выводиться как в консоль, так и в файл. -->
        <Root level="INFO">
            <AppenderRef ref="Console"/> <!-- Логи выводятся в консоль -->
            <AppenderRef ref="FileLogger"/> <!-- Логи записываются в файл -->
        </Root>
    </Loggers>
</Configuration>
```

## консоль

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns="https://logging.apache.org/xml/ns"
               xsi:schemaLocation="
                       https://logging.apache.org/xml/ns
                       https://logging.apache.org/xml/ns/log4j-config-2.xsd">

    <!-- Логи выводятся только в консоль -->

    <Appenders>
        <!-- Консольный аппендер: выводит логи в стандартный вывод (консоль).
             Используется имя "Console" и вывод идет в SYSTEM_OUT (по умолчанию это консоль приложения). -->
        <Console name="Console" target="SYSTEM_OUT">
            <!-- Определение шаблона для вывода лога в консоль.
                 %d - дата, %-5p - уровень логирования, %c{1} - имя класса, %L - номер строки, %m - сообщение, %n - новая строка -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>

        <!-- Файловый аппендер: выводит логи в файл "logs/app.log".
             append="true" означает, что логи будут добавляться в конец файла, а не перезаписываться. -->
        <File name="FileLogger" fileName="logs/app.log" append="true">
            <!-- Определение шаблона для вывода лога в файл. Шаблон аналогичен консольному. -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </File>
    </Appenders>

    <Loggers>
        <!-- Корневой логгер: применяется по умолчанию ко всем классам.
             Уровень логирования "INFO" означает, что сообщения уровня INFO и выше (WARN, ERROR) будут выводиться.
             AppenderRef ref="Console" указывает, что логи будут отправляться в консоль. -->
        <Root level="INFO">
            <AppenderRef ref="Console"/> <!-- Оставляем только консольный аппендер для корневого логгера -->
        </Root>

    </Loggers>
</Configuration>
```

##  файл

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns="https://logging.apache.org/xml/ns"
               xsi:schemaLocation="
                       https://logging.apache.org/xml/ns
                       https://logging.apache.org/xml/ns/log4j-config-2.xsd">

    <!-- Логи выводятся только в файл -->

    <Appenders>
        <!-- Консольный аппендер: выводит логи в стандартный вывод (консоль).
             Используется имя "Console" и вывод идет в SYSTEM_OUT (по умолчанию это консоль приложения).
             Этот аппендер не используется, но остается в конфигурации. -->
        <Console name="Console" target="SYSTEM_OUT">
            <!-- Определение шаблона для вывода лога в консоль.
                 %d - дата, %-5p - уровень логирования, %c{1} - имя класса, %L - номер строки, %m - сообщение, %n - новая строка -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>

        <!-- Файловый аппендер: выводит логи в файл "logs/app.log".
             append="true" означает, что логи будут добавляться в конец файла, а не перезаписываться. -->
        <File name="FileLogger" fileName="logs/app.log" append="true">
            <!-- Определение шаблона для вывода лога в файл. Шаблон аналогичен консольному. -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </File>
    </Appenders>

    <Loggers>
        <!-- Корневой логгер: применяется по умолчанию ко всем классам.
             Уровень логирования "INFO" означает, что сообщения уровня INFO и выше (WARN, ERROR) будут выводиться.
             AppenderRef ref="FileLogger" указывает, что логи будут записываться только в файл. -->
        <Root level="INFO">
            <AppenderRef ref="FileLogger"/> <!-- Оставляем только файловый аппендер для корневого логгера -->
        </Root>

    </Loggers>
</Configuration>
```

##  консоль + файл, сообщения с уровнем error дублируются в logs/error.log 

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns="https://logging.apache.org/xml/ns"
               xsi:schemaLocation="
                       https://logging.apache.org/xml/ns
                       https://logging.apache.org/xml/ns/log4j-config-2.xsd">

    <!-- Логи выводятся в консоль и файл. Сообщения с уровнем error дублируются в logs/error.log -->

    <Appenders>
        <!-- Консольный аппендер: выводит логи в стандартный вывод (консоль).
             Используется имя "Console" и вывод идет в SYSTEM_OUT (по умолчанию это консоль приложения). -->
        <Console name="Console" target="SYSTEM_OUT">
            <!-- Определение шаблона для вывода лога в консоль.
                 %d - дата, %-5p - уровень логирования, %c{1} - имя класса, %L - номер строки, %m - сообщение, %n - новая строка -->
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>

        <!-- Файловый аппендер: выводит логи в файл "logs/app.log".
             append="true" означает, что логи будут добавляться в конец файла, а не перезаписываться. -->
        <File name="FileLogger" fileName="logs/app.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </File>

        <!-- Файловый аппендер для записи только ошибок уровня ERROR в файл error.log -->
        <File name="ErrorFileLogger" fileName="logs/error.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
            <!-- Определяем фильтр, чтобы записывать только сообщения уровня ERROR и выше -->
            <Filters>
                <ThresholdFilter level="ERROR" onMatch="ACCEPT" onMismatch="DENY"/>
            </Filters>
        </File>
    </Appenders>

    <Loggers>
        <!-- Корневой логгер: применяется по умолчанию ко всем классам.
             Уровень логирования "INFO" означает, что сообщения уровня INFO и выше (WARN, ERROR) будут выводиться.
             AppenderRef ref="Console" и AppenderRef ref="FileLogger" указывают, что логи будут выводиться как в консоль, так и в файл.
             Добавляем ErrorFileLogger для записи ошибок уровня ERROR в отдельный файл. -->
        <Root level="INFO">
            <AppenderRef ref="Console"/> <!-- Логи выводятся в консоль -->
            <AppenderRef ref="FileLogger"/> <!-- Логи записываются в файл -->
            <AppenderRef ref="ErrorFileLogger"/> <!-- Ошибки ERROR записываются в отдельный файл -->
        </Root>
    </Loggers>
</Configuration>
```

## консоль + файл, сообщения с уровнем error дублируются в logs/error.log. Размер файлов не более 5Мб,число файлов не более 10 шт.

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
               xmlns="https://logging.apache.org/xml/ns"
               xsi:schemaLocation="
                       https://logging.apache.org/xml/ns
                       https://logging.apache.org/xml/ns/log4j-config-2.xsd">

    <!-- Логи выводятся в консоль и файл. Сообщения с уровнем error дублируются в logs/error.log. Файлы не более 5Мб и не более 10 шт. -->

    <Appenders>
        <!-- Консольный аппендер: выводит логи в стандартный вывод (консоль). -->
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
        </Console>

        <!-- Файловый аппендер для записи логов в app.log с ротацией по размеру -->
        <RollingFile name="FileLogger" fileName="logs/app.log" filePattern="logs/app-%d{yyyy-MM-dd}-%i.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
            <Policies>
                <SizeBasedTriggeringPolicy size="5MB"/> <!-- Максимальный размер файла 5 МБ -->
            </Policies>
            <DefaultRolloverStrategy max="10"/> <!-- Максимальное количество старых файлов 10 -->
        </RollingFile>

        <!-- Файловый аппендер для записи только ошибок уровня ERROR в error.log с ротацией по размеру -->
        <RollingFile name="ErrorFileLogger" fileName="logs/error.log" filePattern="logs/error-%d{yyyy-MM-dd}-%i.log" append="true">
            <PatternLayout pattern="%d{yyyy-MM-dd HH:mm:ss} %-5p %c{1}:%L - %m%n"/>
            <Filters>
                <ThresholdFilter level="ERROR" onMatch="ACCEPT" onMismatch="DENY"/>
            </Filters>
            <Policies>
                <SizeBasedTriggeringPolicy size="5MB"/> <!-- Максимальный размер файла 5 МБ -->
            </Policies>
            <DefaultRolloverStrategy max="10"/> <!-- Максимальное количество старых файлов 10 -->
        </RollingFile>
    </Appenders>

    <Loggers>
        <!-- Корневой логгер: применяется по умолчанию ко всем классам. -->
        <Root level="INFO">
            <AppenderRef ref="Console"/> <!-- Логи выводятся в консоль -->
            <AppenderRef ref="FileLogger"/> <!-- Логи записываются в app.log -->
            <AppenderRef ref="ErrorFileLogger"/> <!-- Ошибки ERROR записываются в error.log -->
        </Root>
    </Loggers>
</Configuration>
```
