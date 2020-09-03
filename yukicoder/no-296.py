HOUR_TO_MINUTES = 60
DAY_TO_MINUTES = 60 * 24

sleep_count, alarm_hours, alarm_minutes, alarm_cycle = map(int, input().split())

convert_alarm_minutes = alarm_hours * 60
convert_alarm_minutes += alarm_minutes

if sleep_count > 1:
    for i in range(1, sleep_count):
        convert_alarm_minutes += alarm_cycle

        if convert_alarm_minutes >= DAY_TO_MINUTES:
            convert_alarm_minutes -= DAY_TO_MINUTES

wakeup_hour, wakeup_minutes = divmod(convert_alarm_minutes, HOUR_TO_MINUTES)
print(wakeup_hour)
print(wakeup_minutes)
