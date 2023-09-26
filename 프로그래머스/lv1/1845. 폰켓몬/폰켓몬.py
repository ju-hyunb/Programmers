def solution(nums):
    type_num = len(set(nums))
    max_type = len(nums)/2
    
    if type_num < max_type:
        return type_num
    else :
        return max_type
