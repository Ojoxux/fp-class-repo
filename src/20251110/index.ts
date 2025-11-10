/**
 * 2025-11-10
 * 題目: 純粋関数のリファクタリングを行ってみよう
 */

class TipCalculator {
  private names: string[] = [];
  private tipPercentage: number = 0;

  // MEMO: 名前を追加する以外にも、名前の個数をカウントしたり、チップの割合を設定する処理があったため、関数を分離した
  public addPerson(name: string): void {
    this.names.push(name);
  }

  /**
   *
   * 元のコード
   * public addPerson(name: string): void {
   *   this.names.push(name);
   *   if (this.names.length > 5) {
   *     this.tipPercentage = 20;
   *   } else if (this.names.length > 0) {
   *     this.tipPercentage = 10;
   *   }
   * }
   */

  // 名前の個数をカウントして、チップの割合を設定する
  // if文じゃなくて、三項演算子で書いた
  public coundNames(names: string[]): number {
    return names.length > 5
      ? (this.tipPercentage = 20)
      : names.length > 0
      ? (this.tipPercentage = 10)
      : (this.tipPercentage = 0);
  }

  public getNames(): string[] {
    return this.names;
  }

  public getTipPercentage(): number {
    return this.tipPercentage;
  }
}

// デバッグ用のコード
const tipCalculator = new TipCalculator();
tipCalculator.addPerson("a");
tipCalculator.addPerson("b");
tipCalculator.addPerson("c");
tipCalculator.addPerson("d");
tipCalculator.addPerson("e");
tipCalculator.addPerson("f");
tipCalculator.addPerson("g");

tipCalculator.coundNames(tipCalculator.getNames());

console.log(tipCalculator.getNames());
console.log(tipCalculator.getTipPercentage());
