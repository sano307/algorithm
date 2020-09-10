HOUR_TO_MINUTES = 60

sleep_count, alarm_hours, alarm_minutes, alarm_cycle = map(int, input().split())

convert_alarm_minutes = alarm_hours * HOUR_TO_MINUTES
convert_alarm_minutes += alarm_minutes
convert_alarm_minutes += alarm_cycle * (sleep_count - 1)

wakeup_hour = convert_alarm_minutes // HOUR_TO_MINUTES
wakeup_minutes = convert_alarm_minutes - wakeup_hour * HOUR_TO_MINUTES

print(wakeup_hour % 24)
print(wakeup_minutes)
