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
@b = global i1 0
@c = global i32 0
@g = global i32 0
@d = global i32 0
define i32 @main(){
store i1 0, i1* @b
store i32 2, i32* @c
store i32 10, i32* @g
%1 = icmp eq i32 1, 1
br i1 %1, label %true1, label %false1
true1:
%2 = load i32, i32* @g
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %2)
store i32 2, i32* @d
%4 = load i1, i1* @b
br i1 %4, label %true2, label %false2
true2:
%5 = load i32, i32* @d
%6 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strpi, i32 0, i32 0), i32 %5)
br label %false2
false2:
br label %false1
false1:
ret i32 0 }
