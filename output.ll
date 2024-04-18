declare i32 @printf(i8*, ...)
declare i32 @sprintf(i8*, i8*, ...)
declare i8* @strcpy(i8*, i8*)
declare i8* @strcat(i8*, i8*)
declare i32 @atoi(i8*)
declare i32 @scanf(i8*, ...)
declare void @llvm.memcpy.p0i8.p0i8.i64(i8* noalias nocapture writeonly, i8* noalias nocapture readonly, i64, i1 immarg)
@strps = constant [4 x i8] c"%s\0A\00"
@strpd = constant [4 x i8] c"%f\0A\00"
@strspd = constant [4 x i8] c"%lf\00"
@strpi = constant [4 x i8] c"%d\0A\00"
@strs = constant [5 x i8] c"%10s\00"
@strspi = constant [3 x i8] c"%d\00"
@a = global i1 0
@b = global i32 0
define i32 @main(){
store i1 1, i1* @a
store i32 2, i32* @b
%1 = load i1, i1* @a
br i1 %1, label %true1, label %false1
true1:
%2 = icmp eq i32 1, 1
br i1 %2, label %true2, label %false2
true2:
%3 = load i1, i1* @a
%4 = zext i1 %3 to i32
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %4)
%6 = load i32, i32* @b
%7 = icmp eq i32 2, %6
br i1 %7, label %true3, label %false3
true3:
%8 = load i32, i32* @b
%9 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %8)
%10 = load i32, i32* @b
%11 = icmp ne i32 2, %10
br i1 %11, label %true4, label %false4
true4:
%12 = load i32, i32* @b
%13 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %12)
br label %false4
false4:
br label %false3
false3:
br label %false2
false2:
br label %false1
false1:
ret i32 0 }
