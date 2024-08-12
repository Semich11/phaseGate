from datetime import datetime, timedelta

date_format = "%d-%m-%Y"

previous_start_date = input("Enter the start date of your previous or current Menstrual period \"use the format (dd-MM-yyyy)\": ")
print()

last_start_date = datetime.strptime(previous_start_date, date_format).date()
formatted_lastStartDate = last_start_date.strftime("%d-%m-%Y")


menstrual_cycle = int(input("On the average, how long is your typical Menstrual Cycle: "))
print()



menstrual_duration = int(input("how many days did your period use to last: "))
print()



last_end_date = last_start_date + timedelta(days = menstrual_duration - 1)

next_start_date = last_start_date + timedelta(days = menstrual_cycle)

next_end_date = next_start_date + timedelta(days = menstrual_duration - 1)

print("The estimated date of your next period is ", next_start_date.strftime("%d-%m-%Y"), " to ", next_end_date.strftime("%d-%m-%Y"))
print()

ovulation_start_date = last_start_date + timedelta(days = menstrual_cycle / 2 - 1)

ovulation_end_date = ovulation_start_date + timedelta(days = 1)

print("Your estimated Ovulation Date is ", ovulation_start_date.strftime("%d-%m-%Y"), " to ", ovulation_end_date.strftime("%d-%m-%Y"));
print()

first_safe_period_start = last_end_date + timedelta(days = 1)


first_safe_period_end = first_safe_period_start + timedelta(days = 3)

second_safe_period_start = ovulation_end_date + timedelta(days = 5)

second_safe_period_end = second_safe_period_start + timedelta(days = 4)

print("Your estimated Safe Period is ", first_safe_period_start.strftime("%d-%m-%Y"), " to ", first_safe_period_end.strftime("%d-%m-%Y"), " and ", second_safe_period_start.strftime("%d-%m-%Y"), " to ", second_safe_period_end.strftime("%d-%m-%Y"));




