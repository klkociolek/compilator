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
@b = global i32 0
@flag = global i1 0
define i32 @main(){
store i32 1, i32* @b
store i1 1, i1* @flag
%1 = load i1, i1* @flag
br i1 %1, label %true1, label %false1
true1:
%2 = load i1, i1* @flag
%3 = zext i1 %2 to i32
%4 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %3)
br label %false1
false1:
store i1 0, i1* @flag
%5 = load i1, i1* @flag
br i1 %5, label %true2, label %false2
true2:
%6 = load i1, i1* @flag
%7 = zext i1 %6 to i32
%8 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %7)
br label %false2
false2:
ret i32 0 }
